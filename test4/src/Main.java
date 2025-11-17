//package com.bigdata.hdfs;
//
//import java.util.Scanner; // 新增导入 Scanner 类
//import ch.qos.logback.classic.LoggerContext;
//import org.apache.hadoop.conf.Configuration;
//import org.apache.hadoop.fs.*;
//import org.apache.hadoop.io.IOUtils;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import java.io.*;
//import java.net.URI;
//
///**
// * HDFS 文件管理器
// * 提供基本的 HDFS 文件操作功能
// */
//public class HDFSFileManager {
//    private static final Logger logger = LoggerFactory.getLogger(HDFSFileManager.class);
//
//    private FileSystem fileSystem;
//    private Configuration configuration;
//
//    /**
//     * 构造函数，初始化 HDFS 连接
//     * @param hdfsUri HDFS 的 URI，例如 "hdfs://localhost:9000"
//     */
//    public HDFSFileManager(String hdfsUri) throws IOException {
//        // 1. 创建 Configuration 对象
//        this.configuration = new Configuration();
//        // 2. 获取 FileSystem 实例（通过 URI 指定 HDFS 地址）
//        this.fileSystem = FileSystem.get(URI.create(hdfsUri), configuration);
//        logger.info("HDFS 连接初始化成功，URI: {}", hdfsUri);
//    }
//
//    /**
//     * 上传本地文件到 HDFS
//     * @param localPath 本地文件路径
//     * @param hdfsPath HDFS 目标路径
//     * @param overwrite 是否覆盖已存在的文件
//     * @return 上传是否成功
//     */
//    public boolean uploadFile(String localPath, String hdfsPath, boolean overwrite) {
//        File localFile = new File(localPath);
//        // 1. 检查本地文件是否存在
//        if (!localFile.exists()) {
//            logger.error("本地文件不存在: {}", localPath);
//            return false;
//        }
//
//        Path hdfsDestPath = new Path(hdfsPath);
//        try {
//            // 2. 创建 HDFS 目标目录（如果不存在）
//            Path parentDir = hdfsDestPath.getParent();
//            if (parentDir != null && !fileSystem.exists(parentDir)) {
//                fileSystem.mkdirs(parentDir);
//                logger.info("创建 HDFS 父目录: {}", parentDir);
//            }
//
//            // 3. 执行文件上传（本地输入流 -> HDFS 输出流）
//            try (InputStream in = new FileInputStream(localFile);
//                 FSDataOutputStream out = fileSystem.create(hdfsDestPath, overwrite)) {
//                IOUtils.copyBytes(in, out, configuration, true); // 自动关闭流
//                logger.info("文件上传成功: 本地[{}] -> HDFS[{}]", localPath, hdfsPath);
//                return true;
//            }
//        } catch (IOException e) {
//            logger.error("文件上传失败", e);
//            return false;
//        }
//    }
//
//    /**
//     * 从 HDFS 下载文件到本地
//     * @param hdfsPath HDFS 文件路径
//     * @param localPath 本地目标路径
//     * @param overwrite 是否覆盖已存在的文件
//     * @return 下载是否成功
//     */
//    public boolean downloadFile(String hdfsPath, String localPath, boolean overwrite) {
//        Path hdfsSrcPath = new Path(hdfsPath);
//        File localFile = new File(localPath);
//
//        try {
//            // 1. 检查 HDFS 文件是否存在
//            if (!fileSystem.exists(hdfsSrcPath)) {
//                logger.error("HDFS 文件不存在: {}", hdfsPath);
//                return false;
//            }
//
//            // 2. 检查本地文件是否已存在且不允许覆盖
//            if (localFile.exists() && !overwrite) {
//                logger.error("本地文件已存在（未开启覆盖）: {}", localPath);
//                return false;
//            }
//
//            // 3. 创建本地父目录（如果不存在）
//            File parentDir = localFile.getParentFile();
//            if (parentDir != null && !parentDir.exists()) {
//                parentDir.mkdirs();
//                logger.info("创建本地父目录: {}", parentDir);
//            }
//
//            // 4. 执行文件下载（HDFS 输入流 -> 本地输出流）
//            try (FSDataInputStream in = fileSystem.open(hdfsSrcPath);
//                 OutputStream out = new FileOutputStream(localFile)) {
//                IOUtils.copyBytes(in, out, configuration, true);
//                logger.info("文件下载成功: HDFS[{}] -> 本地[{}]", hdfsPath, localPath);
//                return true;
//            }
//        } catch (IOException e) {
//            logger.error("文件下载失败", e);
//            return false;
//        }
//    }
//
//    /**
//     * 删除 HDFS 中的文件或目录
//     * @param hdfsPath HDFS 路径
//     * @param recursive 是否递归删除（用于目录）
//     * @return 删除是否成功
//     */
//    public boolean deleteFile(String hdfsPath, boolean recursive) {
//        Path path = new Path(hdfsPath);
//        try {
//            if (!fileSystem.exists(path)) {
//                logger.error("HDFS 路径不存在: {}", hdfsPath);
//                return false;
//            }
//
//            boolean success = fileSystem.delete(path, recursive);
//            if (success) {
//                logger.info("删除成功: HDFS[{}]（递归: {}）", hdfsPath, recursive);
//            } else {
//                logger.error("删除失败: HDFS[{}]", hdfsPath);
//            }
//            return success;
//        } catch (IOException e) {
//            logger.error("删除操作异常", e);
//            return false;
//        }
//    }
//
//    /**
//     * 递归列出目录中的所有文件和子目录
//     * @param hdfsPath HDFS 目录路径
//     * @param depth 当前递归深度（用于格式化输出）
//     */
//    public void listDirectory(String hdfsPath, int depth) {
//        Path path = new Path(hdfsPath);
//        try {
//            if (!fileSystem.exists(path)) {
//                logger.warn("目录不存在: {}", hdfsPath);
//                return;
//            }
//
//            FileStatus status = fileSystem.getFileStatus(path);
//            // 生成缩进字符串（兼容Java 8，替换String.repeat()）
//            StringBuilder indentBuilder = new StringBuilder();
//            for (int i = 0; i < depth; i++) {
//                indentBuilder.append("  ");
//            }
//            String indent = indentBuilder.toString();
//
//            if (status.isDirectory()) {
//                // 目录：打印名称并递归处理子项
//                System.out.printf("%s[目录] %s%n", indent, status.getPath().getName());
//                FileStatus[] childStatuses = fileSystem.listStatus(path);
//                for (FileStatus child : childStatuses) {
//                    listDirectory(child.getPath().toString(), depth + 1);
//                }
//            } else {
//                // 文件：打印名称和大小
//                System.out.printf("%s[文件] %s （大小: %d 字节）%n",
//                        indent, status.getPath().getName(), status.getLen());
//            }
//        } catch (IOException e) {
//            logger.error("目录遍历异常", e);
//        }
//    }
//
//    /**
//     * 统计目录信息
//     * @param hdfsPath HDFS 目录路径
//     * @return DirectoryStats 对象，包含统计信息
//     */
//    public DirectoryStats getDirectoryStats(String hdfsPath) {
//        Path path = new Path(hdfsPath);
//        DirectoryStats stats = new DirectoryStats();
//        try {
//            if (!fileSystem.exists(path)) {
//                logger.warn("统计失败：路径不存在: {}", hdfsPath);
//                return stats;
//            }
//
//            FileStatus status = fileSystem.getFileStatus(path);
//            if (!status.isDirectory()) {
//                logger.warn("统计失败：路径不是目录: {}", hdfsPath);
//                return stats;
//            }
//
//            // 递归统计目录内容
//            countStats(path, stats);
//            logger.info("目录统计完成: {}", hdfsPath);
//        } catch (IOException e) {
//            logger.error("目录统计异常", e);
//        }
//        return stats;
//    }
//
//    // 辅助方法：递归累加统计信息
//    private void countStats(Path path, DirectoryStats stats) throws IOException {
//        FileStatus[] statuses = fileSystem.listStatus(path);
//        for (FileStatus status : statuses) {
//            if (status.isDirectory()) {
//                stats.directoryCount++;
//                countStats(status.getPath(), stats); // 递归统计子目录
//            } else {
//                stats.fileCount++;
//                stats.totalSize += status.getLen(); // 累加文件大小
//            }
//        }
//    }
//
//    /**
//     * 关闭 HDFS 连接
//     */
//    public void close() {
//        if (fileSystem != null) {
//            try {
//                fileSystem.close();
//                logger.info("HDFS 连接已关闭");
//            } catch (IOException e) {
//                logger.error("关闭 HDFS 连接失败", e);
//            }
//        }
//    }
//
//    /**
//     * 目录统计信息类
//     */
//    public static class DirectoryStats {
//        private long fileCount;       // 文件数量
//        private long directoryCount;  // 目录数量
//        private long totalSize;       // 总大小（字节）
//
//        // 无参构造函数
//        public DirectoryStats() {
//            this.fileCount = 0;
//            this.directoryCount = 0;
//            this.totalSize = 0;
//        }
//
//        // Getter 方法
//        public long getFileCount() { return fileCount; }
//        public long getDirectoryCount() { return directoryCount; }
//        public long getTotalSize() { return totalSize; }
//
//        // 格式化输出
//        @Override
//        public String toString() {
//            return String.format("目录统计结果：文件数=%d, 目录数=%d, 总大小=%d 字节",
//                    fileCount, directoryCount, totalSize);
//        }
//    }
//
//    /**
//     * 主方法，用于测试 HDFS 文件管理器
//     */
//    public static void main(String[] args) {
//        HDFSFileManager manager = null;
//        Scanner scanner = new Scanner(System.in); // 初始化 Scanner 接收用户输入
//        // 配置参数（需根据实际环境修改）
//        String hdfsUri = "hdfs://localhost:9000"; // HDFS 服务地址（默认端口9000）
//        String localUploadFile = "/home/hadoop/test_upload.txt"; // 本地测试文件路径
//        String hdfsTestDir = "/user/student/project/test_sdk/"; // HDFS 测试目录
//        String hdfsTargetFile = hdfsTestDir + "test_upload.txt"; // HDFS 目标文件路径
//        String localDownloadFile = "/home/hadoop/test_download.txt"; // 本地下载路径
//
//        try {
//            // 1. 创建 HDFSFileManager 实例（建立连接）
//            manager = new HDFSFileManager(hdfsUri);
//
//            // 2. 测试文件上传（先手动创建本地测试文件：echo "test data" > /home/hadoop/test_upload.txt）
//            boolean uploadSuccess = manager.uploadFile(localUploadFile, hdfsTargetFile, true);
//            if (!uploadSuccess) {
//                logger.error("文件上传测试失败，终止后续流程");
//                return;
//            }
//
//            // 3. 测试目录遍历（遍历 HDFS 测试目录）
//            System.out.println("\n===== HDFS 目录遍历结果 =====");
//            manager.listDirectory(hdfsTestDir, 0);
//
//            // 4. 测试文件下载
//            boolean downloadSuccess = manager.downloadFile(hdfsTargetFile, localDownloadFile, true);
//            if (!downloadSuccess) {
//                logger.error("文件下载测试失败");
//            }
//
//            // 5. 测试目录统计（统计测试目录的信息）
//            DirectoryStats stats = manager.getDirectoryStats(hdfsTestDir);
//            System.out.println("\n===== HDFS 目录统计结果 =====");
//            System.out.println(stats);
//
//            // 6. 测试文件删除（新增：添加用户确认逻辑）
//            System.out.println("\n===== 请先通过 NameNode Web UI 验证操作结果 =====");
//            System.out.println("Web UI 地址：http://localhost:9870（浏览路径：" + hdfsTestDir + "）");
//            System.out.print("\n是否执行删除操作？（Y/y 确认，其他键取消）：");
//            System.out.flush(); // 强制刷新输出流，确保提示先显示
//            String confirm = scanner.nextLine().trim().toLowerCase(); // 接收输入并转为小写
//
//            if ("y".equals(confirm)) {
//                boolean deleteSuccess = manager.deleteFile(hdfsTargetFile, false);
//                if (!deleteSuccess) {
//                    logger.error("文件删除测试失败");
//                }
//            } else {
//                System.out.println("用户取消删除操作，文件保留在 HDFS 中：" + hdfsTargetFile);
//                logger.info("用户取消删除操作，文件未删除");
//            }
//
//        } catch (Exception e) {
//            logger.error("程序执行出错", e);
//        } finally {
//            // 关闭资源：HDFS 连接、Scanner、logback 上下文
//            if (manager != null) {
//                manager.close();
//            }
//            if (scanner != null) {
//                scanner.close(); // 关闭 Scanner
//            }
//            // 关闭 logback 上下文，避免线程残留
//            LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
//            loggerContext.stop();
//        }
//    }
//}
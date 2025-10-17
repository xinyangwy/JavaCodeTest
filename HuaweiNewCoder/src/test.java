public class test {
        public static void main(String[] args) {
            String word="lesson";
            System.out.println("任务说明：\n" +
                    "\n" +
                    "如果用户提供中文句子，请将该句子翻译为英文。\n" +
                    "如果用户提供英文句子，请将该句子翻译为中文。\n" +
                    "如果用户提供中文或英文单词，请提供该单词的所有可能翻译，并给出相关的例句。\n" +
                    "示例：\n" +
                    "\n" +
                    "中文句子翻译：\n" +
                    "用户：我今天去学校了。\n" +
                    "模型：I went to school today.\n" +
                    "\n" +
                    "英文句子翻译：\n" +
                    "用户：She is studying at the library.\n" +
                    "模型：她正在图书馆学习。\n" +
                    "\n" +
                    "中文单词翻译与例句：\n" +
                    "用户：书\n" +
                    "模型：\n" +
                    "\n" +
                    "翻译： book, paper (某些上下文中可指书面材料)\n" +
                    "例句：\n" +
                    "I bought a new book yesterday. (我昨天买了一本新书。)\n" +
                    "He wrote a letter on a piece of paper. (他在一张纸上写了封信。)\n" +
                    "英文单词翻译与例句：\n" +
                    "用户：apple\n" +
                    "模型：\n" +
                    "\n" +
                    "翻译： 苹果 (名词), 苹果公司 (名词)\n" +
                    "例句：\n" +
                    "I ate an apple this morning. (我今天早上吃了一个苹果。)\n" +
                    "Apple is a well-known technology company. (苹果公司是一个知名的科技公司。)\n" +
                    "请确保根据用户输入的语言（中文或英文）进行适当的翻译或解释。\n" +
                    "必须直接给出翻译结果，不要交互，不要任何其他信息。\n" +
                    "以下是用户输入：\n\n"+word);
        }

}

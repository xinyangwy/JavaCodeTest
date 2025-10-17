import java.util.Scanner;

public class HJ18 {
    static int ipA = 0, ipB = 0, ipC = 0, ipD = 0, ipE = 0, ipOrMaskFlase = 0, ipSelf = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String[] ips = sc.nextLine().split("~");
            if (!isMaskValid(ips[1]) || !isIpValid(ips[0])) {
                ipOrMaskFlase++;
                //  本题特殊 类似  "0.*.*.*" 和"127.*.*.*" 的 IP 地址不计入任何类别，也不计入非法统计，直接跳过；
                if (jump(ips[0])){
                    ipOrMaskFlase--;
                }
            } else {
                defineType(ips[0]);
            }
        }
        System.out.println(ipA + " " + ipB + " " + ipC + " " + ipD + " " + ipE + " " + ipOrMaskFlase + " " + ipSelf);
    }

    private static void defineType(String ip) {
        String[] nums = ip.split("\\.");
        int ipFirst = Integer.parseInt(nums[0]);
        int ipSecond = Integer.parseInt(nums[1]);
        if (ipFirst == 0 || ipFirst == 127) {
            return;
        }
        if (ipFirst >= 0 && ipFirst <= 127) {
            if (ipFirst == 10) {
                ipSelf++;
            }
            ipA++;
        }
        if (ipFirst >= 128 && ipFirst <= 191) {
            if (ipFirst == 172 && ipSecond >= 16 && ipSecond <= 31) {
                ipSelf++;
            }
            ipB++;
        }
        if (ipFirst >= 192 && ipFirst <= 223) {
            if (ipFirst == 192 && ipSecond == 168) {
                ipSelf++;
            }
            ipC++;
        }
        if (ipFirst >= 224 && ipFirst <= 239) {
            ipD++;
        }
        if (ipFirst >= 240 && ipFirst <= 255) {
            ipE++;
        }

    }

    private static boolean isIpValid(String ip) {
        String[] nums = ip.split("\\.");
        for (String num : nums) {
            if (num.isEmpty()) {
                return false;
            }
            if (Integer.parseInt(num) > 255 || Integer.parseInt(num) < 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isMaskValid(String maskCode) {
        if (!isIpValid(maskCode)) {
            return false;
        }

        String[] nums = maskCode.split("\\.");
        String totalBinStr = "";
        for (String num : nums) {
            String binStr = Integer.toBinaryString(Integer.parseInt(num));
            while (binStr.length() < 8) {
                binStr = "0" + binStr;
            }
            totalBinStr += binStr;
        }
        if (!totalBinStr.contains("0") || !totalBinStr.contains("1")) {
            return false;//注意，全为 1 或全为 0 的掩码也视为非法。
        }
        int count = 0;
        for (char c : totalBinStr.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }
        //最后一个1的位置  等于  所有1的数量-1
        if ((count - 1) == totalBinStr.lastIndexOf("1")) {
            return true;
        }
        return false;
    }

    private static boolean jump(String ip) {
        String[] nums = ip.split("\\.");
        int ipFirst = Integer.parseInt(nums[0]);
        if (ipFirst == 0 || ipFirst == 127) {
            return true;
        }
        return false;
    }

}

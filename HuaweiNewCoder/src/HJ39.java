import javax.imageio.metadata.IIOMetadataNode;
import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class HJ39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String maskCode = sc.nextLine();
        String ip1 = sc.nextLine();
        String ip2 = sc.nextLine();
        if (isMaskCodeLawful(maskCode) && isIpLawful(ip1) && isIpLawful(ip2)) {
            System.out.println(isInSameInternet(maskCode, ip1, ip2));
        } else {
            System.out.println(1);
        }

    }

    private static int isInSameInternet(String maskCode, String ip1, String ip2) {
        String[] mask = maskCode.split("\\.");
        String[] nums1 = ip1.split("\\.");
        String[] nums2 = ip2.split("\\.");
        for (int i = 0; i < 4; i++) {
            if ((Integer.parseInt(mask[i]) & Integer.parseInt(nums1[i])) !=
                    (Integer.parseInt(mask[i]) & Integer.parseInt(nums2[i]))
            ) {
                return 2;
            }
        }
        return 0;
    }

    private static boolean isIpLawful(String ip) {
        String[] nums = ip.split("\\.");
        for (String num : nums) {
            if (Integer.parseInt(num) > 255 || Integer.parseInt(num) < 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isMaskCodeLawful(String maskCode) {
        if(!isIpLawful(maskCode)){
            return false;
        }
        String[] nums = maskCode.split("\\.");
        //最后一个1的位置  等于  所有1的数量
        String totalBinStr = "";
        for (String num : nums) {
            String binStr = Integer.toBinaryString(Integer.parseInt(num));
            while (binStr.length() < 8) {
                binStr = "0" + binStr;
            }
            totalBinStr += binStr;
        }
        int count = 0;
        for (char c : totalBinStr.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }
        if ((count - 1) == totalBinStr.lastIndexOf("1")) {
            return true;
        }
        return false;
    }
}

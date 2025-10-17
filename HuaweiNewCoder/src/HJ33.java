import java.util.Scanner;

public class HJ33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        long num = sc.nextLong();
        System.out.println(two2ten(str1));
        ten2two(num);
    }

    private static void ten2two(Long num) {
        String strBin = Long.toBinaryString(num);
        while (strBin.length() < 32) {
            strBin = "0" + strBin;
        }
        for (int i = 0; i < 32; i += 8) {
            System.out.print(Integer.parseInt(strBin.substring(i, i + 8),2));
            if (i != 24) {
                System.out.print(".");
            }
        }
    }

    private static long two2ten(String ip) {
        String[] nums = ip.split("\\.");
        String totalBin = "";
        for (String num : nums) {
            int n = Integer.parseInt(num);
            String strBin = Integer.toBinaryString(n);
            while (strBin.length() < 8) {
                strBin = "0" + strBin;
            }
            totalBin += strBin;
        }
        long res = Long.parseLong(totalBin, 2);
        return res;
    }

}
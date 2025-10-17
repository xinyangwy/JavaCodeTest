import java.util.Scanner;

public class HJ32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            int len1 = longest(str, i, i);
            int len2 = longest(str, i, i + 1);
            res = Math.max(res, len1 > len2 ? len1 : len2);
        }
        System.out.println(res);
    }

    private static int longest(String str, int l, int r) {
        while(l>=0 && r<str.length() && str.charAt(l)==str.charAt(r)){
            l--;
            r++;
        }
        return r-l+1-2;
    }

}

import java.util.Scanner;

public class HJ29 {
    static String L1 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    static String L2 = "BCDEFGHIJKLMNOPQRSTUVWXYZAbcdefghijklmnopqrstuvwxyza1234567890";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1=sc.nextLine();
        System.out.println(fun(str1));
        String str2=sc.nextLine();
        System.out.println(deFun(str2));
    }

    private static String fun(String str) {
        char []ch=str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            ch[i]=L2.charAt(L1.indexOf(ch[i]));
        }
        return new String(ch);
    }

    private static String deFun(String str){
        char []ch=str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            ch[i]=L1.charAt(L2.indexOf(ch[i]));
        }
        return new String(ch);
    }
}

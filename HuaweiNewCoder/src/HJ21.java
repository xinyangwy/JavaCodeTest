import java.util.HashMap;
import java.util.Scanner;

public class HJ21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        str=str.replaceAll("[a|b|c]","2");
        str=str.replaceAll("[d|e|f]","3");
        str=str.replaceAll("[g|h|i]","4");
        str=str.replaceAll("[j|k|l]","5");
        str=str.replaceAll("[m|n|o]","6");
        str=str.replaceAll("[p|q|r|s]","7");
        str=str.replaceAll("[t|u|v]","8");
        str=str.replaceAll("[w|x|y|z]","9");

        char []ch=str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            char c=ch[i];
            if(c>='A' && c<='Y'){
                ch[i]=(char) (c+32+1);
            }else if(c=='Z'){
                ch[i]='a';
            }
        }
        for (char c : ch) {
            System.out.print(c);
        }
    }
}

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class HJ15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        String bin=Integer.toBinaryString(num);
        String bin1=bin.replace("0","");
        System.out.println(bin1.length());
    }
}

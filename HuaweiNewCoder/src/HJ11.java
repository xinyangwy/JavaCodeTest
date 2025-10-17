import java.util.Scanner;

public class HJ11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line =sc.nextLine();
        StringBuffer str=new StringBuffer(line);
        System.out.println(str.reverse());
    }
}

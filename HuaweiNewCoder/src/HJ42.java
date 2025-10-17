import java.util.Scanner;

public class HJ42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int delta=Math.abs(b-a);
        int max=Math.max(a,b);
        System.out.println(max+delta);
    }
}

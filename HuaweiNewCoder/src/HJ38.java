import java.util.Scanner;

public class HJ38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        double totalDistince=0;
        double height=n;
        totalDistince+=height;
        for (int i = 1; i <=4; i++) {
            height= (double) height /2;
            totalDistince+=height*2;
        }
        height= (double) height /2;
        System.out.println(totalDistince);
        System.out.println(height);
    }
}

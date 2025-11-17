import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        //偶数  前n/2个     162534
//        //奇数数  前n/2个   15243
//        int []numsPre=new int[n/2+1];
//        if(n/2==0) {
//
//        }
//        int []numsPost=new int[n/2+1];
//        int []nums=new int[n+1];


        for (int i = 1; i <= n / 2; i++) {
            System.out.print(i + " ");
            System.out.print((n - i + 1) + " ");
        }
        if (n%2 == 1){
            System.out.print(n/2+1);
        }
    }
}

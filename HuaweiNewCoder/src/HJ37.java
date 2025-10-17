import java.util.Scanner;

public class HJ37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if(n<3){
            System.out.println(3);
        }else {
            int []dp=new int[n];
            dp[0]=1;
            dp[1]=1;
            for (int i = 2; i < n; i++) {
                dp[i]=dp[i-1]+dp[i-2];
            }
            System.out.println(dp[n-1]);
        }
    }
}

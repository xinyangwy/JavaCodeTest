import java.lang.reflect.Array;
import java.util.*;

public class HJ24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []nums=new int[n];
        for (int i = 0; i < n; i++) {
            nums[i]=sc.nextInt();
        }

        int []dp1=new int[n];//左边  dp1[i]表示 i以及i之前 以nums[i]结尾的最长递增子序列的长度
        int []dp2=new int[n];//右边  dp2[i]表示 i以及i之前 以nums[i]结尾的最长递减子序列的长度
        Arrays.fill(dp1,1);//非常重要
        Arrays.fill(dp2,1);//非常重要
        int res=0;
        for (int j = 1; j < n; j++) {
            for (int i = 0; i < j; i++) {
                if(nums[j]>nums[i]){
//                    if(dp[i]+1>dp[j]){
//                        dp[j]=dp[i]+1;
//                    }
                    dp1[j]=Math.max(dp1[j],dp1[i]+1);
                }
            }
        }
        for (int j = n-2; j >=0; j--) {
            for (int i = n-1; i > j; i--) {
                if(nums[j]>nums[i]){
//                    if(dp[i]+1>dp[j]){
//                        dp[j]=dp[i]+1;
//                    }
                    dp2[j]=Math.max(dp2[j],dp2[i]+1);
                }
            }
        }
        int min=n;
        for (int i = 0; i < n; i++) {
            min=Math.min(min,n-(dp1[i]+dp2[i]-1));
        }
        System.out.println(min);
    }
}

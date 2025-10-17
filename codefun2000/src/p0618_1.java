import java.io.*;
import java.util.Scanner;

public class p0618_1 {
    public static void main(String[] args)   {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // 三个状态的初始化
        long []dp0=new long[n];
        long []dp1=new long[n];//前i个元素内，dp取反操作正在进行中（区间已开始且尚未结束）
        long []dp2=new long[n];
        dp0[0] = a[0];    // 未取反
        dp1[0] = -a[0];   // 正在取反
        dp2[0] = a[0];    // 已取反
        long ans = Math.max(dp0[0], Math.max(dp1[0], dp2[0]));

        for (int i = 1; i < n; i++) {
            long x = a[i];
            // 状态转移
            dp0[i] = Math.max(dp0[i-1] + x, x);//
            dp1[i] = Math.max(dp1[i-1] - x, dp0[i-1] - x);//前面的已经取反 a[i]再取反， a[i]取反
            dp2[i] = Math.max(dp2[i-1] + x, dp1[i-1] + x);//
            // 更新最大值
            ans = Math.max(ans, Math.max(dp0[i], Math.max(dp1[i], dp2[i])));
        }

        System.out.println(ans);
    }
}

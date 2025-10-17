import java.util.ArrayList;
import java.util.Scanner;

public class HJ16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Goods[] goods = new Goods[m];
        for (int i = 0; i < m; i++) {
            goods[i] = new Goods();
        }
        for (int i = 0; i < m; i++) {
            int price = sc.nextInt();
            int value = sc.nextInt();
            int zhu = sc.nextInt();
            goods[i].p = price;
            goods[i].v = price * value;
            if (zhu == 0) {
                goods[i].main = true;
            } else if (goods[zhu - 1].a1 == -1) {
                goods[zhu - 1].a1 = i;
            } else {
                goods[zhu - 1].a2 = i;
            }
        }
        //dp[i][j] 表示使用编号为0-i的物品 所获得的满意度为j
        // 1、不购买该物品，  dp[i-1][j]
        // 2、购买该物品，    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - goods[i-1].p] + goods[i-1].v);
        // 3、购买该物品及附件1，dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - goods[i-1].p - goods[goods[i-1].a1].p] + goods[i-1].v + goods[goods[i-1].a1].v);
        // 4、购买该物品及附件2，dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - goods[i-1].p - goods[goods[i-1].a2].p] + goods[i-1].v + goods[goods[i-1].a2].v);
        // 5、购买该物品及附件1及附件2，dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - goods[i-1].p - goods[goods[i-1].a1].p - goods[goods[i-1].a2].p] + goods[i-1].v + goods[goods[i-1].a1].v + goods[goods[i-1].a2].v);
        // dp[i][j]取这五种情况的最大值
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = dp[i - 1][j];
                if (!goods[i - 1].main) {
                    continue;
                }
                if (j >= goods[i - 1].p) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - goods[i-1].p] + goods[i-1].v);
                }
                if (goods[i - 1].a1 != -1 && j >= goods[i - 1].p + goods[goods[i - 1].a1].p) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - goods[i-1].p - goods[goods[i-1].a1].p] + goods[i-1].v + goods[goods[i-1].a1].v);
                }
                if (goods[i - 1].a2 != -1 && j >= goods[i - 1].p + goods[goods[i - 1].a2].p) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - goods[i-1].p - goods[goods[i-1].a2].p] + goods[i-1].v + goods[goods[i-1].a2].v);
                }
                if (goods[i - 1].a1 != -1 && goods[i - 1].a2 != -1 && j >= goods[i - 1].p + goods[goods[i - 1].a1].p + goods[goods[i - 1].a2].p) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - goods[i-1].p - goods[goods[i-1].a1].p - goods[goods[i-1].a2].p] + goods[i-1].v + goods[goods[i-1].a1].v + goods[goods[i-1].a2].v);
                }
            }
        }
        System.out.println(dp[m][n]);
    }

    private static class Goods {
        int p;
        //满意度
        int v;
        //是否有附件
        boolean main = false;
        //附件编号
        int a1 = -1;
        int a2 = -1;
    }
}

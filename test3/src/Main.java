import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        char[][] grid = new char[n][m];
        int[][] dp = new int[n][m];//到达ij 醉倒可以获得的分数

        for (int i = 0; i < n; i++) {
            String str = in.next();
            for (int j = 0; j < m; j++) {
                grid[i][j] = str.charAt(j);
            }
        }
//初始化dp
        dp[0][0]=getScore(grid,0,0);
        for (int j = 1; j < m; j++) {//m列
            dp[0][j] = dp[0][j - 1] + getScore(grid, 0, j);
        }
        for (int i = 1; i < n; i++) {
            dp[i][0] = dp[i - 1][0] + getScore(grid, i, 0);
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + getScore(grid, i, j);
            }
        }
        System.out.println(dp[n-1][m-1]);
    }

    private static int getScore(char[][] grid, int i, int j) {
        if (grid[i][j] == 'l') {
            return 4;
        } else if (grid[i][j] == 'o') {
            return 3;
        } else if (grid[i][j] == 'v') {
            return 2;
        } else if (grid[i][j] == 'e') {
            return 1;
        } else {
            return 0;
        }
    }
}
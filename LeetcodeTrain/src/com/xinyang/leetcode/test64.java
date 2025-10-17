package com.xinyang.leetcode;

public class test64 {
}


class Solution64 {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int dp[][] = new int[m][n];//设dp[i][j]为从【0】【0】到达grid[i][j]的最小路径和
        dp[0][0] = grid[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j != 0) dp[i][j] = dp[i][j - 1] + grid[i][j];
                else if (i != 0 && j == 0) dp[i][j] = dp[-1][j] + grid[i][j];
                else if (i != 0 && j != 0) dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]) + grid[i][j];
            }
        }
        return dp[m - 1][n - 1];
    }
}
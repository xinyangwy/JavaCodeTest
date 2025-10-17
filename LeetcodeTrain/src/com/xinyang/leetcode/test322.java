package com.xinyang.leetcode;

public class test322 {
}

class Solution322 {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int max=Integer.MAX_VALUE;
        int dp[] = new int[amount + 1];// 能组成数字为j 的 组合个数
        for (int j = 1; j < dp.length; j++) {
            dp[j] = max;
        }
        dp[0] = 0;// 1 <= target <= 1000 ,所以dp[0] = 1没有什么实际意义，仅仅是为了推导递推公式。

        for (int j = 0; j <= amount; j++) {
            for (int i = 0; i < n; i++) {
                if (j >= coins[i]){
                    dp[j] = Math.min(dp[j - coins[i]] + 1, dp[j]);
                }

            }
        }
        return dp[amount];
    }
}


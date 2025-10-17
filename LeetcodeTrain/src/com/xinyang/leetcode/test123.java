package com.xinyang.leetcode;

public class test123 {
}


class Solution123 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int dp[][] = new int[n][5];
        dp[0][1] = -prices[0];
        dp[0][3] = -prices[0];//注意这里的初始化
        // 第0天第二次买入操作，初始值应该是多少呢？应该不少同学疑惑，第一次还没买入呢，怎么初始化第二次买入呢？
        // 第二次买入依赖于第一次卖出的状态，其实相当于第0天第一次买入了，第一次卖出了，
        // 然后再买入一次（第二次买入），那么现在手头上没有现金，只要买入，现金就做相应的减少。
        // 所以第二次买入操作，初始化为：dp[0][3] = -prices[0];

        for (int i = 1; i < n; i++) {
            dp[i][0] = dp[i - 1][0];
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
            dp[i][2] = Math.max(dp[i - 1][2], dp[i - 1][1] + prices[i]);
            dp[i][3] = Math.max(dp[i - 1][3], dp[i - 1][2] - prices[i]);
            dp[i][4] = Math.max(dp[i - 1][4], dp[i - 1][3] + prices[i]);
        }
        return dp[n - 1][4];
    }
}
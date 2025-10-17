package com.xinyang.leetcode;

public class test121 {
}


//class Solution {
//    public int maxProfit(int[] prices) {
//        //当前遍历到的prices[i] 减去之前遍历的所有数的最大值
//        int n=prices.length;
//        int res=0;
//        int min=Integer.MAX_VALUE;
//        for(int i=0;i<n;i++){
//            min=Math.min(min,prices[i]);
//            res=Math.max(res,prices[i]-min);
//        }
//        return res;
//    }
//}

class Solution121 {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int dp[][]=new int[n][2];
        dp[0][0]=0;
        dp[0][1]=-prices[0];
        for(int i=1;i<n;i++){
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            dp[i][1]=Math.max(dp[i-1][1],-prices[i]);
        }
        return dp[n-1][0];
    }
}
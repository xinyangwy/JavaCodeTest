package com.xinyang.leetcode;

public class test188 {
}


class Solution188 {
    public int maxProfit(int k, int[] prices) {
        int n=prices.length;
        int dp[][]=new int[n][k*2+1];
        for(int j=0;j<k*2+1;j++){
            if(j%2==1){
                dp[0][j]=-prices[0];
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<k*2+1;j+=2){
                dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-1]-prices[i]);
                dp[i][j+1]=Math.max(dp[i-1][j+1],dp[i-1][j]+prices[i]);
            }
        }
        return dp[n-1][2*k];
    }
}
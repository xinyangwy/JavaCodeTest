package com.xinyang.leetcode;

public class test279 {
}


class Solution279 {
    public int numSquares(int n) {
        int max=Integer.MAX_VALUE;
        int nums[]=new int[101];
        for(int i=0;i<=100;i++){
            nums[i]=i*i;
        }
        int dp[]=new int[n+1];
        for(int i=1;i<=n;i++){
            dp[i]=max;
        }
        dp[0]=0;
        for(int i=0;i<=100;i++){
            for(int j=nums[i];j<=n;j++){
                if(dp[j]!=max){
                    dp[j]=Math.min(dp[j],dp[j-nums[i]]+1);
                }
            }
        }
        return dp[n];
    }
}
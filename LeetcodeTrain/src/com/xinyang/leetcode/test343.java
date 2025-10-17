package com.xinyang.leetcode;

public class test343 {
}


class Solution343 {
    public int integerBreak(int n) {
        if(n==2)return 1;
        if(n==3)return 2;
        //dp[i]：分拆数字i，可以得到的最大乘积为dp[i]。
        int dp[]=new int[n+1];
        dp[2]=1;
        dp[3]=2;
        for(int i=4;i<=n;i++){
            for(int j=1;j<i;j++){
                dp[i]=Math.max(dp[i],Math.max(j*dp[i-j],j*(i-j)));
            }
        }
        return dp[n];
    }
}


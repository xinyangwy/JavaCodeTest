package com.xinyang.leetcode;

public class test509 {
}

class Solution509 {
    public int fib(int n) {
        if(n<=1)return n;
        int []dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=0;i<n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}

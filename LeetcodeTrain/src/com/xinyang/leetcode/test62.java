package com.xinyang.leetcode;

public class test62 {
}


class Solution62 {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];//到达  m行，n列   路径数
        for(int i=0;i<n;i++){
            dp[0][i]=i;
        }
        for(int i=0;i<m;i++){
            dp[i][0]=i;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=dp[i][j-1]+dp[i-1][j];
            }
        }
        if(n==0)return dp[m][0];
        if(m==0)return dp[0][n];
        return dp[m-1][n-1];
    }
}
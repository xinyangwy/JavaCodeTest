package com.xinyang.leetcode;

public class test96 {
}


class Solution96 {
    //以i为根节点的二叉搜索树的数量
    //等于   以i-1的总数的二叉搜索树的数量   乘以  以n-i的二叉搜索树的数量。
    //dp[i] ： 1到i为节点组成的二叉搜索树的个数为dp[i]。
    public int numTrees(int n) {
        int dp[]=new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++){
            for(int j=1;j<=n;j++){
                dp[i]=dp[j-1]*dp[n-j];
            }
        }
        return dp[n];
    }
}


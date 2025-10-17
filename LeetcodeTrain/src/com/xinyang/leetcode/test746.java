package com.xinyang.leetcode;

public class test746 {
}


class Solution746 {
    public int minCostClimbingStairs(int[] cost) {
        int  n=cost.length;
        if(n==1)return cost[0];
        if(n==2)return Math.min(cost[0],cost[1]);
        int dp[]=new int[n+1];
        for(int i=2;i<=n;i++){
            if(cost[i-1]<=cost[i-2]){
                dp[i]=dp[i-1]+cost[i-1];
            }else{
                dp[i]=dp[i-2]+cost[i-2];
            }
        }
        return dp[n];
    }
}
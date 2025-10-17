package com.xinyang.leetcode;

public class test1049 {
}


class Solution1049 {
    public int lastStoneWeightII(int[] stones) {
        int sum=0,n=stones.length;
        for(int num:stones){
            sum+=num;
        }
        int target=sum/2;
        int dp[]=new int[target+1];//dp[i]容量为i的筐最大能容纳的石头的总重量
        //类似01背包  石头的重量就是物品的重量 衡量价值也是使用的物品的重量来衡量
        //假设所有石头总重量为sum  那么dp[sum/2] 和 dp[sum-sum/2]的差值就是最后能剩余的最小石头重量
        //假设所有石头总重量为23  那么dp[11] 和 dp[12]的差值就是最后能剩余的最小石头重量
        //                        7  4     2 1 8 1                           1
        //
        for(int i=0;i<n;i++){
            for(int j=target;j>=stones[i];j--){
                dp[j]=Math.max(dp[j],dp[j-stones[i]]+stones[i]);
            }
        }
        return sum-dp[target]-dp[target];
    }
}
package com.xinyang.leetcode;

public class test377 {
}


class Solution377 {
    public int combinationSum4(int[] nums, int target) {
        int n=nums.length;
        int dp[]=new int[target+1];//能组成数字为j 的 组合个数
        for(int i=0;i<n;i++){
            for(int j=nums[i];j<=target;j++){
                dp[j]=dp[j]+dp[j-nums[i]];
            }
        }
        return dp[target];
    }
}
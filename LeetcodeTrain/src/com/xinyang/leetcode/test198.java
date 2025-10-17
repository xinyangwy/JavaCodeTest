package com.xinyang.leetcode;

public class test198 {
}


class Solution198 {
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];//使用下标为0~i的元素 所能凑成的最大数
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++){
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
            //选nums[i] ，那么nums[i-1]不选，之前的状态：使用下标为0~i-2的元素 所能凑成的最大数
            //不选nums[i]
        }
        return dp[n-1];
    }
}
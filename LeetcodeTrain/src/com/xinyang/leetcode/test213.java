package com.xinyang.leetcode;

public class test213
{
}


class Solution213 {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        return Math.max(findmax(nums,0,n-2),findmax(nums,1,n-1));
    }

    public int findmax(int[] nums,int start,int end) {
        int dp[] = new int[end];// 使用下标为0~i的元素 所能凑成的最大数
        dp[start] = nums[start];
        dp[start+1] = Math.max(nums[start], nums[start+1]);
        for (int i = start+2; i <= end; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
            // 选nums[i] ，那么nums[i-1]不选，之前的状态：使用下标为0~i-2的元素 所能凑成的最大数
            // 不选nums[i],即只考虑0~i-1房凑成的最大数
        }
        return dp[end];
    }
}
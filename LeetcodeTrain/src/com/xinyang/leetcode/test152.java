package com.xinyang.leetcode;

public class test152 {
}


class Solution152 {
    public int maxProduct(int[] nums) {
        int max = 0;
        int n = nums.length;
        int dp[] = new int[n];
        dp[0] = nums[0];
        for (int i = 1; i < n; i++) {
            if ((dp[i - 1] < 0 && nums[i] < 0) || (dp[i - 1] > 0 && nums[i] > 0)) {
                dp[i] = dp[i - 1] + nums[i];
            } else {
                dp[i] = nums[i];
            }
            max=Math.max(max,dp[i]);
        }
        return max;
    }
}
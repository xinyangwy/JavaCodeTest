package com.xinyang.leetcode;

public class test2012 {
}


class Solution2012 {
    public int sumOfBeauties(int[] nums) {
        int n = nums.length;
        if (n <= 2) return 0;
        int Min = 100000, Max = 0;
        int min[] = new int[n];
        int max[] = new int[n];

        for (int i = 0; i < n; i++) {
            Max = Math.max(Max, nums[i]);
            max[i] = Max;
        }
        for (int i = n-1; i >=0 ; i--) {
            Min = Math.min(Min, nums[i]);
            min[i] = Min;
        }

        int res=0;
        for (int i = 1; i <= n - 2; i++) {
            if (max[i - 1] == nums[i] && min[i + 1]==nums[i]) {
                res+=2;
            } else if (nums[i - 1] < nums[i] && nums[i] < nums[i + 1]) {
                res+=1;
            }
        }
        return res;
    }
}
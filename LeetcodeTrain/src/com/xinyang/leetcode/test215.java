package com.xinyang.leetcode;

import java.util.Arrays;

public class test215 {
}



class Solution215 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
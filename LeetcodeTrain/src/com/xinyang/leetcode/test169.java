package com.xinyang.leetcode;

import java.util.Arrays;

public class test169 {
}


class Solution169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
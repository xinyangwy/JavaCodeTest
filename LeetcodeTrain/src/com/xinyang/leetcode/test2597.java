package com.xinyang.leetcode;

import java.util.*;

public class test2597 {
    public static void main(String[] args) {
        Solution2597 s = new Solution2597();
        System.out.println(s.beautifulSubsets(new int[]{2, 4, 4, 6}, 2));
    }
}

class Solution2597 {
    int res=0;
    Map<Integer, Integer> path = new HashMap<>();

    public int beautifulSubsets(int[] nums, int k) {
        backTracking(nums, 0, k);
        return res;
    }

    public void backTracking(int[] nums, int startindex, int k) {
        if (!path.isEmpty()) {//重要
            res++;
        }
        for (int i = startindex; i < nums.length; i++) {
            // 如果（新元素值 +k 或者-k） 不在path 中，那么加入
            if (path.getOrDefault(nums[i] - k, 0) == 0 && path.getOrDefault(nums[i] + k, 0) == 0) {
                path.merge(nums[i], 1, Integer::sum);//元素
                backTracking(nums, i + 1, k);
                path.merge(nums[i], -1, Integer::sum);
            }
        }
    }
}
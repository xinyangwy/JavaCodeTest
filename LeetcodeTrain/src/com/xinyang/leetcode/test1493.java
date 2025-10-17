package com.xinyang.leetcode;

import java.util.HashMap;
import java.util.Map;

public class test1493 {
}


class Solution1493 {
        public int longestSubarray(int[] nums) {
            int maxLength = 0;

            Map<Integer,Integer> map=new HashMap<>();

            for (int left = 0,right = 0; right < nums.length; right++) {
                if (nums[right] == 0) {
                    map.merge(0,1,Integer::sum);
                }
                // 当 0 的数量超过 1 个时，需要缩小窗口
                while (map.getOrDefault(0,0) > 1) {
                    if (nums[left] == 0) {
                        map.merge(0,-1,Integer::sum);
                    }
                    left++;
                }
                // 更新最长子数组的长度
                maxLength = Math.max(maxLength, right - left);
            }
            return maxLength;
        }
    }
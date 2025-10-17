package com.xinyang.leetcode;

import java.util.HashMap;
import java.util.Map;

public class test01 {
    public static void main(String[] args) {
        Solution01 solution01 = new Solution01();
//        solution01.twoSum();

    }
}


class Solution01 {
    // 使用哈希表
    public int[] twoSum(int[] nums, int target) {
        int []res=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int tmp = target - nums[i];
            if(map.containsKey(tmp)) {
                res[0]=i;
                res[1]=map.get(tmp);
            }
            map.put(nums[i],i);
        }
        return res;
    }
}
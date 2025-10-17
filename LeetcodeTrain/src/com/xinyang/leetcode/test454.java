package com.xinyang.leetcode;

import java.util.HashMap;
import java.util.Map;

public class test454 {
    public static void main(String[] args) {
        Solution454 s=new Solution454();
//        s.fourSumCount();
    }
}

class Solution454 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num1: nums1){
            for(int num2: nums2){
                int sum=num1+num2;
                map.put(sum,map.getOrDefault(sum,0)+1);
                //值为sum的数出现的次数，次数为 map.getOrDefault(sum,0)+1
                //map.getOrDefault(sum,0) 值为sum的数出现的次数，次数为键值对sum（key）对应的value
                //map.getOrDefault(sum,0) 作用是如果map里面没有key==sum的对，那么取默认值0；防止java丢出异常
            }
        }
        int res=0;
        for(int num3: nums3){
            for(int num4: nums4){
                res+=map.getOrDefault(-(num3+num4),0);
            }
        }
        return res;
    }
}

package com.xinyang.leetcode;

import java.util.Arrays;

public class test209 {
    public static void main(String[] args) {
        Solution209 s = new Solution209();
//        int target=15;
//        int []nums= {5,1,3,5,10,7,4,9,2,8};
//        System.out.println(s.minSubArrayLen(target, nums));
    }
}


class Solution209 {
    public int minSubArrayLen(int target, int[] nums) {
        int slow = 0,sum=0,res=Integer.MAX_VALUE;// 滑动窗口起始位置
        for(int fast = 0;fast<nums.length;fast++){
            sum+=nums[fast];
            while(sum>=target){
                res=Math.min(res,fast-slow+1);
                sum-=nums[slow++];
            }
        }
        return res==Integer.MAX_VALUE?0:res;
    }
//    public int minSubArrayLen(int target, int[] nums) {
//        int sum = 0;
//        int res = Integer.MAX_VALUE;
//        for (int i = 0; i < nums.length; i++) {
//            sum=0;
//            for (int j = i; j < nums.length; j++) {
//                sum += nums[j];
//                if (sum >= target) {
//                    res = (j - i + 1) < res ? (j - i + 1) : res;
//                    break;
//                }
//            }
//        }
//        return res == Integer.MAX_VALUE ? 0 : res;//如果res没有被赋值，说明数组元素的综合没有超过target
//    }
}
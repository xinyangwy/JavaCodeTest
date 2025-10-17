package com.xinyang.leetcode;

import javax.lang.model.util.Elements;

public class test35 {
}


class Solution35 {
    public int searchInsert(int[] nums, int target) {
        if(nums.length==0)return 0;
        int left=0,right=nums.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return left;
    }
}
package com.xinyang.leetcode;

public class test704 {
    public int search(int[] nums, int target) {
        if(target<nums[0] || target>nums[nums.length-1]){
            return -1;
        }
        int left = 0,right = nums.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return -1;
    }
}

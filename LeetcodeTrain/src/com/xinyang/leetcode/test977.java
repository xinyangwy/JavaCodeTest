package com.xinyang.leetcode;

public class test977 {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int []res = new int[n];
        int left = 0,right=n-1,index=n-1;
        while( left!=right) {
            if(nums[left]*nums[left]>nums[right]*nums[right]) {
                res[index--]=nums[left]*nums[left];
                ++left;
            }else{
                res[index--]=nums[right]*nums[right];
                --right;
            }
        }
        return res;
    }
}

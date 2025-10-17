package com.xinyang.leetcode;

public class test674 {
}


class Solution674 {
    public int findLengthOfLCIS(int[] nums) {
        int n=nums.length;
        int res=1;
        for(int i=1;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[j-1]>=nums[j]){
                    break;
                }
                res=Math.max(res,j-i+1);
            }
        }
        return res;
    }
}
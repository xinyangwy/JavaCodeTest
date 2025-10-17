package com.xinyang.leetcode;

import java.util.Arrays;
import java.util.Collections;

public class test976 {
}


class Solution976 {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        if(n<3)return 0;
        for(int i=n-1;i>=0;i--){
            for(int j=i-1;j>=0;j--){
                for(int k=j-1;j>=0;j--){
                    if(isSan(nums[i],nums[j],nums[k])){
                        return nums[i]+nums[j]+nums[k];
                    }
                }
            }
        }
        return 0;
    }
    private boolean isSan(int x,int y,int z){
        if(x+y>z && x+z>y && y+z>x){
            return true;
        }
        return false;
    }
}
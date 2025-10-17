package com.xinyang.leetcode;

import javax.swing.plaf.IconUIResource;

public class tesr45 {
}


class Solution45 {
    public int jump(int[] nums) {
        int curDistance =0,MaxDistance=0;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            MaxDistance=Math.max(MaxDistance,i+nums[i]);
            if(MaxDistance>=nums.length){
                cnt++;
                return cnt;
            }
            if(i==curDistance){
                curDistance=MaxDistance;
                cnt++;
            }
        }
        return cnt;
    }
}
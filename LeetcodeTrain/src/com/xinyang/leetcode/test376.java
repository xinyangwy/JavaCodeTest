package com.xinyang.leetcode;

public class test376 {
}


class Solution376 {
    public int wiggleMaxLength(int[] nums) {
        int curDiff =0;
        int preDiff =0;
        int count=1;//当数组中只有一个数的时候也算 有一个； 考虑两端
        for(int i=1 ;i< nums.length;i++){
            curDiff=nums[i]-nums[i-1];
            if((curDiff>0&& preDiff<=0)||(curDiff<0 && preDiff>=0)){
                count++;
                preDiff=curDiff;
            }
        }
        return count;
    }
}
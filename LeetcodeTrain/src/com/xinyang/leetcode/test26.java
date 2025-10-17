package com.xinyang.leetcode;

public class test26 {
}

class Solution26 {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        boolean []appeared=new boolean[10000];
        int index=0;
        for(int i=0;i<n;i++){
            if(appeared[nums[i]]==false){
                appeared[nums[i]]=true;
                nums[index++]=nums[i];
            }
        }
        return index+1;
    }
}

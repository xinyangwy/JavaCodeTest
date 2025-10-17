package com.xinyang.leetcode;

public class test287 {
}


class Solution287 {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int count[]=new int[n+1];
        for (int num : nums) {
            count[num]++;
        }
        for(int i=0;i<n+1;i++){
            if(count[i]>1)return i;
        }
        return 0;
    }
}

package com.xinyang.leetcode;

public class test_q3 {
}


class Solution_q3 {
    public int minZeroArray(int[] nums, int[][] queries) {
        int n=queries.length;
        int k=0;
        for (int[] q : queries) {
            for(int i=q[0];i<=q[1];i++){
                nums[i]=(nums[i]-q[2])>=0?(nums[i]-q[2]):nums[i];
            }
            k++;
            if(all0(nums)){
                return k;
            }
        }
        return -1;
    }
    private boolean all0(int[] nums){
        for (int num : nums) {
            if(num!=0){
                return false;
            }
        }
        return true;
    }
}
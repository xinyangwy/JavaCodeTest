package com.xinyang.leetcode;

import java.util.*;

public class test300 {
    public static void main(String[] args) {
        Solution300 s=new Solution300();
        System.out.println(s.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }
}


class Solution300 {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        int res=0;
        for(int j=1;j<n;j++){
            for(int i=0;i<j;i++){
                if(nums[j]>nums[i]){
                    dp[j]=Math.max(dp[j],dp[i]+1);
                    //注意这里不是要dp[i] 与 dp[j] + 1进行比较，而是我们要取dp[j] + 1的最大值。
                }
            }
            res=Math.max(res,dp[j]);
        }
        return res;
    }
}
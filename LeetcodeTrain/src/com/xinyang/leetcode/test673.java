package com.xinyang.leetcode;

import java.util.Arrays;

public class test673 {
}


class Solution673 {
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length, maxLen = 1;
        if(n == 1) return 1;
        int dp[] = new int[n];// dp[i]表示 i以及i之前 以nums[i]结尾的最长递增子序列的长度
        int count[]=new int[n];//到nums[i]为止的最长递增子序列个数
        Arrays.fill(dp, 1);
        Arrays.fill(count, 1);
        for(int j=1;j< nums.length;j++){
            for(int i=0;i<j;i++){
                if(nums[j]>nums[i]){
                    // [1,3,5,4,7]  有两个最长递增子序列，分别是 [1, 3, 4, 7] 和[1, 3, 5, 7]
                    if(dp[i]+1>dp[j]){//i=2 dp[4]=0, dp[2]=3,,dp[2]+1=4>dp[4],dp[4]=4
                        dp[j]=dp[i]+1;
                        //如果dp[i] + 1 > dp[j]，说明最长递增子序列的长度增加了，dp[i] = dp[j] + 1，长度增加，数量不变 count[j] = count[i]
                        count[j]=count[i];
                    }else if(dp[i]+1==dp[j]){//i=3 dp[4]=4, dp[3]=3,,dp[3]+1=4 == dp[4],        长度为4的最长递增子序列个数+1
                        //如果dp[i] + 1 == dp[j]，说明最长递增子序列的长度并没有增加，但是出现了长度一样的情况，数量增加 count[j] += count[i]
                        count[j]+=count[i];
                    }
                }
            }
            maxLen=Math.max(maxLen,dp[j]);
        }

        int res=0;
        for (int j=0;j<nums.length;j++){
            if(dp[j]==maxLen){
                res+=count[j];
            }
        }
        return res;
    }
}
package com.xinyang.leetcode;

public class test416 {
}


class Solution416 {
    public boolean canPartition(int[] nums) {
        //dp[j] 表示： 容量（所能装的重量）为j的背包，所背的物品价值最大可以为dp[j]。
        //本题中每一个元素的数值既是重量，也是价值
        int n=nums.length;
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        if(sum/2!=0)return false;
        int target=sum/2;
        int dp[]=new int[target+1];
        for(int i=0;i<n;i++){
            for(int j=target;j>=nums[i];j--){
                dp[j]=Math.max(dp[j],dp[j-nums[i]]+nums[i]);
            }
            if(dp[target]==target){
                return true;
            }
        }
        return dp[target]==target;
    }
}
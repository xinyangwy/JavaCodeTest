package com.xinyang.leetcode;

public class test494 {
}


//class Solution494 {
//    public int findTargetSumWays(int[] nums, int target) {
//        int sum = 0;
//        int n = nums.length;
//        for (int num : nums) {
//            sum += num;
//        }
//        if (sum < Math.abs(target)) {
//            return 0;
//        }
//        int addSum = (sum + target) / 2;
//        if((sum + target) % 2 != 0) {//如果没有恰好的addSum这个数，那么最终也凑不成target
//            return 0;
//        }
//        int dp[][] = new int[n][addSum + 1];
//        dp[0][0] = 1;
//        if (nums[0] <= addSum) {
//            dp[0][nums[0]] = 1;
//        }
//        int numZeros = 0;
//        for (int i = 0; i < nums.length; i++) {//注意这里的初始化，特别注意数值为0的情况
//            if (nums[i] == 0) {
//                numZeros++;
//            }
//            dp[i][0] = (int) Math.pow(2, numZeros);
//
//        }
//        for (int i = 1; i < n; i++) {
//            for (int j = 1; j <= addSum; j++) {
//
//            }
//        }
//        return dp[n - 1][addSum];
//    }
//}



class Solution494 {
    public int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        if((sum+target)/2!=0){
            return 0;
        }
        int addSum=(sum+target)/2;
        int dp[]=new int[addSum+1];//凑成数值为i，可以的方法为dp[i]种
        dp[0]=1;
        for(int i=0;i<n;i++){
            for(int j=addSum;j>=nums[i];j--){
                dp[j]=dp[j]+dp[j-nums[i]];
            }
        }

        return dp[addSum];
    }
}


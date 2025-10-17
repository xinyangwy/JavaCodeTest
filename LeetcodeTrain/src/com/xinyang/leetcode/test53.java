package com.xinyang.leetcode;

public class test53 {
}


class Solution53 {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] sum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            sum[i + 1] = sum[i] + nums[i];
        }
        int max = Integer.MIN_VALUE;
        for (int l = 0; l < n; l++) {
            for (int r = l + 1; r <= n; r++) {
                max = Math.max(max, sum[r] - sum[l]);
            }
        }
        return max;
    }
}



//class Solution138 {
//    public int maxSubArray(int[] nums) {
//        int n=nums.length;
//        int dp[]=new int[n+1];//dp[i]表示以nums[i]结尾的数组 的 最大子数组和
//        dp[0]=nums[0];
//        int max=Integer.MIN_VALUE;
//        for(int i=1;i<n;i++){
//            if(dp[i-1]>0){
//                dp[i]=dp[i-1]+nums[i];////无论nums[i]大于或者小于0   加上dp[i-1]会变大
//            }
//            else{
//                dp[i]=nums[i];//无论nums[i]大于或者小于0 加上dp[i-1]只会更小
//            }
//            max=Math.max(dp[i],max);
//        }
//        return  max;
//    }
//}
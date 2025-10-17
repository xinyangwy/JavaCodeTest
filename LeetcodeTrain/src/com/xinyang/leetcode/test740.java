package com.xinyang.leetcode;

public class test740 {
    public static void main(String[] args) {
        Solution740 s=new Solution740();
        System.out.println(s.deleteAndEarn(new int[]{2,2,3,3,3,4}));
    }
}


class Solution740 {
    public int deleteAndEarn(int[] nums) {
        int max=0;
        for (int num : nums) {
            max=Math.max(max,num);
        }
        int []sum=new int[max+1];
        for (int num : nums) {
            sum[num]+=num;
        }
        return rob(sum);
    }
    private int rob(int sum[]){
        int n=sum.length;
        int dp[]=new int[n];
        dp[0]=sum[0];
        dp[1]=Math.max(sum[0],sum[1]);
        for (int i=2;i<n;i++){
            dp[i]=Math.max(dp[i-2]+sum[i],dp[i-1]);
        }
        return dp[n-1];
    }
}
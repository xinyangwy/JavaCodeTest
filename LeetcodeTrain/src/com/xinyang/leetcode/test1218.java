package com.xinyang.leetcode;

import java.util.Arrays;

public class test1218 {
    public static void main(String[] args) {
        Solution1218 s=new Solution1218();
        System.out.println(s.longestSubsequence(new int[]{3,4,-3,-2,-4},-5));
    }
}

class Solution1218 {
    public int longestSubsequence(int[] arr, int difference) {
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        int maxlen=1;
        for (int j = 1; j < n; j++) {
            for (int i = 0; i < j; i++) {
                if (arr[i] + difference == arr[j]) {
                    dp[j]=Math.max(dp[j],dp[i]+1);
                }
            }
            maxlen=Math.max(maxlen,dp[j]);
        }
        return maxlen;
    }
}
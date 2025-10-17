package com.xinyang.leetcode;

import java.util.HashSet;
import java.util.List;

public class test139 {
    public static void main(String[] args) {
        Solution139 s=new Solution139();
        System.out.println(s.maxUncrossedLines(new int[]{1,4,2},new int[]{1,2,4}));
    }
}


class Solution139 {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        if (len1 == 0 || len2 == 0) return 0;
        // 创建 (len1 + 1) * (len2 + 1) 的 dp 数组
        int[][] dp = new int[len1 + 1][len2 + 1];

        // 填充 dp 数组
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (nums1[i-1]== nums2[i-1] ){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        return dp[len1][len2];
    }
}
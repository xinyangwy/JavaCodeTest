package com.xinyang.leetcode;

public class test1143 {
    public static void main(String[] args) {
        Solution1143 s=new Solution1143();
        System.out.println(s.longestCommonSubsequence("142","124"));
    }
}


class Solution1143 {
    public int longestCommonSubsequence(String text1, String text2) {
        int len1 = text1.length();
        int len2 = text2.length();
        if (len1 == 0 || len2 == 0) return 0;
        // 创建 (len1 + 1) * (len2 + 1) 的 dp 数组
        int[][] dp = new int[len1 + 1][len2 + 1];

        // 填充 dp 数组
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        return dp[len1][len2];
    }
}
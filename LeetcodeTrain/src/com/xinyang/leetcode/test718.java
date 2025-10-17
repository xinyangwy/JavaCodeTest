package com.xinyang.leetcode;

import java.util.HashMap;
import java.util.*;

public class test718 {
}


class Solution718 {
    public int findLength(int[] nums1, int[] nums2) {
        // 获取两个数组的长度
        int m = nums1.length;
        int n = nums2.length;

        // 创建一个二维数组 dp，用于存储最长公共子数组的长度
        int[][] dp = new int[m + 1][n + 1];
        // 要对第一行，第一列经行初始化
        for (int i = 0; i < nums1.length; i++) if (nums1[i] == nums2[0]) dp[i][0] = 1;
        for (int j = 0; j < nums2.length; j++) if (nums1[0] == nums2[j]) dp[0][j] = 1;
        // 初始化最大长度为 0
        int max = 0;

        // 遍历 nums1 的每个元素（从 1 到 m）
        for (int i = 1; i < m + 1; i++) {
            // 遍历 nums2 的每个元素（从 1 到 n）
            for (int j = 1; j < n + 1; j++) {
                // 如果当前元素相等
                if (nums1[i] == nums2[j]) {
                    // 更新 dp[i][j] 为左上角的值加 1
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    // 更新最大长度
                    max = Integer.max(max, dp[i][j]);
                }
            }
        }

        // 返回最大长度
        return max;
    }
}

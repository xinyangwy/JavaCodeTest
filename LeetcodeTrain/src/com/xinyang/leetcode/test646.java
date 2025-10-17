package com.xinyang.leetcode;

import java.util.Arrays;

public class test646 {
    public static void main(String[] args) {
        Solution646 s=new Solution646();
        System.out.println(s.findLongestChain(new int[][]{{1,2},{2,3},{3,4}}));
    }
}


class Solution646 {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, ((o1, o2) -> o1[0] - o2[0]));
        int n = pairs.length;
        int dp[] = new int[n];
        Arrays.fill(dp,1);
        for (int j = 1; j < n; j++) {
            for (int i = 0; i < j; i++) {
                if (pairs[i][1] < pairs[j][0]) {
                    dp[j] = dp[i] + 1;
                } else {
                    dp[j] =Math.max(dp[j],dp[i]);
                }
            }
        }
        return dp[n-1];
    }
}
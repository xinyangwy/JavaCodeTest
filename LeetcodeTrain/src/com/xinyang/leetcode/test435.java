package com.xinyang.leetcode;

import java.util.Arrays;

public class test435 {
}


class Solution435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        if (n == 0)
            return 0;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int res = 1;
        int curRight = intervals[0][1];
        for (int i = 1; i < n; i++) {
            if (intervals[i][0] < curRight) {// 该区间能被当前箭right穿过
                intervals[i][1]=intervals[i][0];
                res++;
            }
            curRight = intervals[i][1];

        }
        return res;
    }
}
package com.xinyang.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;

public class test452 {
}


class Solution452 {
    public int findMinArrowShots(int[][] points) {
        int n = points.length;
        if (n == 0)
            return 0;
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int res = 1;
        int arrow = points[0][1];
        for (int i = 1; i < n; i++) {
            if (points[i][0] <= arrow) {// 该区间能被当前箭right穿过
                continue;
            }
            arrow = points[i][1];
            res++;
        }
        return res;
    }
}
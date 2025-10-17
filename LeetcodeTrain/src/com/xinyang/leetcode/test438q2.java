package com.xinyang.leetcode;

import java.util.*;

public class test438q2 {
//    public static void main(String[] args) {
//        Solution438q2 s=new Solution438q2();
//        System.out.println(s.maxSum(new int[][]{{1,2},{3,4}},new int[]{1,2},2));;
//    }
}

//
//
//class Solution438q2 {
//    public long maxSum(int[][] grid, int[] limits, int k) {
//        if (k == 0) return 0;
//        int n = grid.length, m = grid[0].length;
//        List<int[]> elements = new ArrayList<>(); // 存储[元素值, 行号]
//
//        // 收集所有元素及其行号
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                elements.add(new int[]{grid[i][j], i});
//            }
//        }
//
//        // 按元素值降序排序
//        Collections.sort(elements, (a, b) -> b[0] - a[0]);
//        Arrays.sort(elements,(a, b) -> b[0] - a[0]);
//        long sum = 0;
//        for (int[] elem : elements) {
//            int val = elem[0], row = elem[1];
//            if (limits[row] > 0 && k > 0) {
//                sum += val;
//                limits[row]--;
//                k--;
//                if (k == 0) break;
//            }
//        }
//        return sum;
//    }
//}
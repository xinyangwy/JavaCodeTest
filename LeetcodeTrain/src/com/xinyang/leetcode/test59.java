package com.xinyang.leetcode;

public class test59 {
    public static void main(String[] args) {
        int n =3;
        Solution1 solution = new Solution1();
        System.out.println(solution.generateMatrix(n));
    }
}


class Solution1 {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int loop = 0, left = 0, right = n - 1, top = 0, bottom = n - 1, cnt = 1;
        while (loop <= n / 2) {
            for (int i = left; i <= right - 1; i++) {
                matrix[top][i] = cnt++;
            }
            for (int i = top; i <= bottom - 1; i++) {
                matrix[i][right] = cnt++;
            }
            for (int i = right; i >= left+1; i--) {
                matrix[bottom][i] = cnt++;
            }
            for (int i = bottom; i >= top+1; i--) {
                matrix[i][left] = cnt++;
            }
            loop++;
            left++;
            right--;
            bottom--;
            top++;
        }
        if(n%2!=0){
            matrix[n/2][n/2] = cnt;// n 为奇数时，单独处理矩阵中心的值
        }
        return matrix;
    }
}
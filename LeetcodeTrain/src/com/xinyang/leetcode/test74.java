package com.xinyang.leetcode;

public class test74 {
}


class Solution74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int left=0,right=m*n-1;
        while(left<=right){
            int mid=(left+right)/2;
            int i=mid/n-1,j=mid%n-1;
            if(matrix[i][j]==target){
                return true;
            }else if(matrix[i][j]<target){
                left++;
            }else{
                right--;
            }
        }
        return false;
    }
}
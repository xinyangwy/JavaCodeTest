package com.xinyang.leetcode;

public class test240 {
}


class Solution240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l=0,r=matrix[0].length;
        int flag=0;
        while(l<=r){
            int mid=(l+r)/2;
            if(matrix[0][mid]>target){
                r=mid-1;
            }
            else if(matrix[0][mid]<target){
                l=mid+1;
            }
            else if(matrix[0][mid]==target){
                return true;
            }
        }
        int top=0,bottom=matrix.length;
        while(top<=bottom){
            int mid=(top+bottom)/2;
            if(matrix[mid][r]>target){
                bottom=mid-1;
            }
            else if(matrix[mid][r]<target){
                top=mid+1;
            }
            else if(matrix[mid][r]==target){
                return true;
            }
        }
        return false;
    }
}
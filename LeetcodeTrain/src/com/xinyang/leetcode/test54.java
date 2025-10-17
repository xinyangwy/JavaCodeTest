package com.xinyang.leetcode;

import java.util.ArrayList;
import java.util.List;

public class test54 {
}


class Solution54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length,n=matrix[0].length;
        int left=0,right=n-1,top=0,bottom=m-1;
        int num=1;
        List<Integer> res=new ArrayList<>();
        while(left<=right && top<=bottom){
            for(int i=left;i<right;i++){
                res.add(matrix[top][i]);
            }
            for(int i=top;i<bottom;i++){
                res.add(matrix[i][right]);
            }
            for(int i=right;i>left;i--){
                res.add(matrix[bottom][i]);
            }
            for(int i=bottom;i>top;i--){
                res.add(matrix[i][left]);
            }
            left++;
            right--;
            bottom--;
            top++;
        }
        // System.out.println(matrix[matrix[0].length/2][matrix.length/2]);
        // System.out.print(right);
        if(res.size()<m*n){
            res.add(matrix[matrix.length/2][matrix[0].length/2]);
        }
        return res;
    }
}
package com.xinyang.leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class test73 {
}


class Solution73 {
    public void setZeroes(int[][] matrix) {
        int  m=matrix.length;
        int n=matrix[0].length;
        HashSet<Integer> rows=new HashSet<>();
        HashSet<Integer> lines=new HashSet<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    rows.add(i);
                    lines.add(j);
                }
            }
        }
        for(int j:rows){
            for(int i=0;i<m;i++){
                matrix[i][j]=0;
            }
        }
        for(int i:lines){
            for(int j=0;j<m;j++){
                matrix[i][j]=0;
            }
        }
    }
}
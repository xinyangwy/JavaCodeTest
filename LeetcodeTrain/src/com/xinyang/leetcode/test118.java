package com.xinyang.leetcode;

import java.util.*;

public class test118 {
}

class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> row =new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    row.add(1);
                }else{
                    List<Integer> preRow =res.get(i-1);
                    row.add(preRow.get(j-1)+preRow.get(j));
                }
            }
            res.add(row);
        }
        return res;
    }
}

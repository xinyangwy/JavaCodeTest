package com.xinyang.leetcode;

import java.util.*;

public class test119 {
}


class Solution1119 {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            List<Integer> row =new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    row.add(1);
                }else{
                    List<Integer> preRow =res.get(i-1);//这里的i-1没有-1的情况  因为上面的if处理了边界
                    row.add(preRow.get(j-1)+preRow.get(j));
                }
            }
            res.add(row);//记得添加进res
        }
        return res.get(rowIndex);
    }
}
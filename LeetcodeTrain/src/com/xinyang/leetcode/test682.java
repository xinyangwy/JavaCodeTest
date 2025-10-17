package com.xinyang.leetcode;


import java.util.ArrayList;
import java.util.List;

public class test682 {
}

class Solution682 {
    public int calPoints(String[] operations) {
        List<Integer> res=new ArrayList<>();
        for(String op:operations){
            int n= res.size();
            switch (op){
                case "+":
                    res.add(res.get(n-1)+res.get(n-2));
                case "D":
                    res.add(res.get(n-1)*2);
                case "C":
                    res.remove(n-1);
                default:
                    res.add(Integer.parseInt(op));
            }
        }
        int sum=0;
        for(int num:res){
            sum+=num;
        }
        return sum;
    }
}

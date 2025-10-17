package com.xinyang.leetcode;

import java.util.ArrayList;
import java.util.List;

public class test22 {
}

class Solution22 {
    List<String> res=new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        String path="";
        dfs(path,n,n);
        return res;
    }
    private void dfs(String path,int left,int right){//左括号还可以使用的个数
        if(left==0 && right==0){
            res.add(path);
        }else if(left>right){
            return;
        }
        if(left>0){
            dfs(path+'(',left-1,right);
        }
        if(right>0){
            dfs(path+')',left,right-1);
        }
    }
}
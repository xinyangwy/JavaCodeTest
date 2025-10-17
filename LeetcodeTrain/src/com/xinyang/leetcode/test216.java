package com.xinyang.leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class test216 {
}


class Solution216 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res=new ArrayList<>();
        if(n<k){
            return res;
        }
        Deque<Integer> path=new ArrayDeque<>();
        dfs(k,n,res,path,1);
        return res;
    }

    private void dfs(int k, int n,List<List<Integer>> res,Deque<Integer> path,int startindex) {
        if(path.size()==k){
            int sum=0;
            for(int num:path){
                sum+=num;
            }
            if(sum==n){
                res.add(new ArrayList<>(path));
            }
        }
        for(int i=startindex;i<=9;i++){
            path.add(i);
            dfs(k,n,res,path,i+1);
            path.removeLast();
        }
    }
}
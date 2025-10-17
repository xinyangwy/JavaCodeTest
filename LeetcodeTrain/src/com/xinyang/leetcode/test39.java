package com.xinyang.leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class test39 {
}


class Solution39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        Deque<Integer> path =new ArrayDeque<>();
        dfs(res,path,candidates,0,target);
        return res;
    }

    public void dfs(List<List<Integer>> res,Deque<Integer> path,int[] candidates,int index,int target){
        int sum=0;
        for(int i:path){
            sum+=i;
        }
        if(sum==target){
            res.add(new ArrayList<>(path));
            return;
        }
        if(sum>target){return;}
        for (int i=index;i<candidates.length;i++){
            path.add(candidates[i]);
            dfs(res,path,candidates,i,target);
            path.removeLast();
        }
    }

}
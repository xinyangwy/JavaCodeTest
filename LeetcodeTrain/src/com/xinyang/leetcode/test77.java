package com.xinyang.leetcode;
import java.util.*;

public class test77 {
}


//给出1-n范围内所有可能的k个数字的组合
class Solution77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res =new LinkedList<>();
        Deque<Integer> path=new ArrayDeque<>();
        dfs(res,path,n,k,1);//startindex代表的是起始的数字 组合的数字 以数字1开始
        return res;
    }
    private void dfs(List<List<Integer>> res,Deque<Integer> path,int n,int k,int startIndex){
        if(path.size()==k){//path是存储深度优先遍历时候  从根部到叶子结点路径的所有节点的值，如果达到树高(k) 就代表可以添加到最后的res数组中
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=startIndex;i<n;i++){
            path.add(i);
            dfs(res,path,n,k,i+1);
            path.removeLast();
        }
    }
}

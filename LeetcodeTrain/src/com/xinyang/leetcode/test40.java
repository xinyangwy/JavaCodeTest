package com.xinyang.leetcode;

import java.util.*;

public class test40 {
}


class Solution40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        Deque<Integer> path =new ArrayDeque<>();
        Arrays.sort(candidates); // 先进行排序
        Boolean []used=new Boolean[candidates.length];
        dfs(res,path,candidates,target,used,0,0);
        return res;
    }
    public void dfs(List<List<Integer>> res, Deque<Integer> path, int[] candidates, int target,Boolean []used, int index, int sum){
        if(sum==target){// 找到了数字和为 target 的组合
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i=index;i<candidates.length;i++){
            if(i!=0 && candidates[i]==candidates[i-1] && used[i-1]==false){
                continue;
            }
            if(sum+candidates[i]>target){break;}//剪枝优化
            path.add(candidates[i]);
            used[i]=true;
            //一定一定要注意 下面这里dfs传入的参数是i而非index
            //之所以传入的不是i+1是因为数字可以重复，
            dfs(res,path,candidates,target,used,i+1,sum+candidates[i]);//注意这里的sum，后面没有sum-什么什么
            used[i]=false;
            path.removeLast();// 回溯，移除路径 path 最后一个元素
        }
    }
}
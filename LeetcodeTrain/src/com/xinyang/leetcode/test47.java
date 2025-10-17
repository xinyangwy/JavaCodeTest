package com.xinyang.leetcode;

import java.util.*;

public class test47 {
}


class Solution47 {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> path=new ArrayList<>();
        boolean []used =new boolean[nums.length];//注意这里used的使用是必要的
        backTracking(nums,path,used);
        return res;
    }
    private void backTracking(int[] nums,List<Integer> path,boolean []used){
        if(path.size()==nums.length){
            res.add(new ArrayList<>(path));
        }
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(used[i]==true || hs.contains(nums[i]))continue;
            hs.add(nums[i]);
            path.add(nums[i]);
            used[i]=true;
            backTracking(nums,path,used);
            used[i]=false;
            path.remove(path.size()-1);
        }
    }
}

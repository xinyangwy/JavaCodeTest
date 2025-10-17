package com.xinyang.leetcode;

import java.util.*;

public class test46 {
}

class Solution46 {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> path=new ArrayList<>();
        boolean []used =new boolean[nums.length];
        backTracking(nums,path,used);
        return res;
    }
    private void backTracking(int[] nums,List<Integer> path,boolean []used){
        if(path.size()==nums.length){
            res.add(new ArrayList<>(path));
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]==true)continue;
            path.add(nums[i]);
            used[i]=true;
            backTracking(nums,path,used);
            used[i]=false;
            path.remove(path.size()-1);
        }
    }
}

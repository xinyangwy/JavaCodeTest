package com.xinyang.leetcode;

import java.util.*;

public class test491 {
}



class Solution491 {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<Integer> path=new ArrayList<>();
        backTracking(nums,path,0);
        return res;
    }

    private void backTracking(int[] nums,List<Integer> path,int startindex){
        if(path.size()>=2){
            res.add(new ArrayList<>(path));
        }
        HashSet<Integer> hs=new HashSet<>();
        for(int i=startindex;i<nums.length;i++){
            if(!path.isEmpty() && nums[i]<path.get(path.size()-1) || hs.contains(nums[i])){
                continue;
            }
            hs.add(nums[i]);
            path.add(nums[i]);
            backTracking(nums,path,i+1);
            path.remove(path.size()-1);
        }
    }
}
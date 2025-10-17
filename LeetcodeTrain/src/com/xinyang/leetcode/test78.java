package com.xinyang.leetcode;
import java.util.*;
public class test78 {
}


class Solution78 {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> path=new ArrayList<>();
//        res.add(path);
        backTracking(nums,path,0);
        return res;
    }

    public void backTracking(int[] nums,List<Integer> path,int startindex){
        res.add(new ArrayList<>(path));
        for(int i=startindex;i< nums.length;i++){
            path.add(nums[i]);
            backTracking(nums,path,i+1);
            path.remove(path.size()-1);
        }
    }

}
package com.xinyang.leetcode;

import java.util.*;

public class test90 {
}




//class Solution90 {
//        List<List<Integer>> res=new ArrayList<>();
//        public List<List<Integer>> subsetsWithDup(int[] nums) {
//            List<Integer> path=new ArrayList<>();
//            Arrays.sort(nums); // 先进行排序  这是必要的步骤，使相同的数字排列在一起
//            boolean []used=new boolean[nums.length];
//            backTracking(nums,path,used,0);
//            return res;
//        }
//        public void backTracking(int[] nums,List<Integer> path,boolean []used,int startindex){
//            res.add(new ArrayList<>(path));
//            for(int i=startindex;i< nums.length;i++){
//                if(i!=0 && nums[i]==nums[i-1] && used[i-1]==false){//注意这里仅仅是对树层的去重***
//                    continue;
//                }
//                path.add(nums[i]);
//                used[i]=true;//注意不要遗忘了这里
//                backTracking(nums,path,used,i+1);//注意这里的i+1 不要写成index，注意当初始集合里面的数字要求不能重复使用的时候，这里必须是i+1;  如果初始集合里面的数字可以重复使用，这里是i;
//                used[i]=false;
//                path.remove(path.size()-1);
//            }
//        }
//}

class Solution90 {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> path=new ArrayList<>();
        Arrays.sort(nums); // 先进行排序
        backTracking(nums,path,0);
        return res;
    }
    public void backTracking(int[] nums,List<Integer> path,int startindex){
        res.add(new ArrayList<>(path));
        HashSet<Integer> hs=new HashSet<>();
        for(int i=startindex;i< nums.length;i++){
            if(hs.contains(nums[i])){
                continue;
            }
            hs.add(nums[i]);
            path.add(nums[i]);
            backTracking(nums,path,i+1);
            path.remove(path.size()-1);
        }
    }
}
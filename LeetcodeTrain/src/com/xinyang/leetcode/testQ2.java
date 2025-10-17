package com.xinyang.leetcode;

import javax.sound.sampled.EnumControl;
import java.util.HashMap;
import java.util.List;
import java.util.*;



class testQ2{
    public static void main(String[] args) {
        Solution_testQ2 s=new Solution_testQ2();

        System.out.println( s.solveQueries(new int[]{1,3,1,4,1,3,2},new int[]{0,3,5}));
    }
}
class Solution_testQ2 {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        Map<Integer,List<Integer>> map=new HashMap<>();
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            List<Integer> list=map.getOrDefault(nums[i],new ArrayList<>());
            list.add(i);
            map.put(nums[i],list);
        }
        int n=nums.length;
        for (int query : queries) {
            List<Integer> list=map.getOrDefault(nums[query],new ArrayList<>());
            int mindis=n;
            for(int i=0;i<list.size();i++){
                //对于每一个非自身的位置
                if(list.get(i)==query){
                    int post= i==list.size()-1?0:(i+1);
                    if(post!=i){
                        int min=Math.min(list.get(post),query);
                        int max=Math.max(list.get(post),query);
                        int dis=Math.min(max-min,min+n-max);
                        mindis=Math.min(dis,mindis);
                    }

                    if(post!=i){
                        int pre= i==0?(list.size()-1):(i-1);
                        int min=Math.min(list.get(pre),query);
                        int max=Math.max(list.get(pre),query);
                        int dis=Math.min(max-min,min+n-max);
                        mindis=Math.min(dis,mindis);
                    }

                    break;
                }
            }
            res.add(mindis==n?-1:mindis);
        }
        return res;
    }
}
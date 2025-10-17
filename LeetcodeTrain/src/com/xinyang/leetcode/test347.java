package com.xinyang.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class test347 {
}


class Solution347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map =new HashMap<>();
        PriorityQueue<int[]> pq=new PriorityQueue<>((pair1,pair2)->{
            return pair2[1]-pair1[1];//后-前  从大到小排序 大根堆  队列最前面是最大的数
        });
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key: map.keySet()){
            pq.add(new int[]{key,map.get(key)});
        }
        int []res=new int[k];
        int index=0;
        for(int i=0;i<k;i++){
            res[i]=pq.poll()[0];
        }
        return res;

    }
}

package com.xinyang.leetcode;

import java.net.NetworkInterface;
import java.util.*;

public class test210 {
    public static void main(String[] args) {
        Solution210 s=new Solution210();
        int []res=s.findOrder(2,new int[][]{{1,0},{0,1}});
        for (int re : res) {
            System.out.println(re);
        }
    }
}


class Solution210 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        //统计所有入度为0的节点，统计此节点所有相连的节点
        int in[] = new int[numCourses];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int[] p : prerequisites) {
            in[p[0]]++;
            List<Integer> list = map.getOrDefault(p[1], new ArrayList<>());
            list.add(p[0]);
            map.put(p[1], list);
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<in.length;i++){
            if(in[i]==0)q.add(i);
        }
        int res[]=new int[numCourses];
        int index=0;
        while (!q.isEmpty()) {
            res[index++]=q.peek();
            List<Integer> tmp=map.getOrDefault(q.peek(),new ArrayList<>());
            q.poll();
            for (int i : tmp) {
                in[i]--;
                if(in[i]==0)q.add(i);
            }
        }
        if(index==0)return new int[0];
        return res;
    }
}
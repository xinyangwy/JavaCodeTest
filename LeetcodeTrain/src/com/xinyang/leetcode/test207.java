package com.xinyang.leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.*;

public class test207 {
}


class Solution207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int in[] = new int[numCourses];
        // 使用哈希表来存储图的邻接表，键是课程编号，值是该课程指向的所有课程的列
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int[] p : prerequisites) {
            in[p[0]]++; // 对于每一个先修课程对，目标课程（p[0]）的入度加1
            List<Integer> list = map.getOrDefault(p[1], new ArrayList<>());
            list.add(p[0]);
            map.put(p[1], list);//p[1]指向的所有节点为list
        }
        Queue<Integer> q = new LinkedList<>();// 使用队列来存储入度为0的课程，用于拓扑排序
        for (int i = 0; i < numCourses; i++) {
            if (in[i] == 0) {
                q.add(i);
            }
        }
        int cnt = numCourses;
        while (!q.isEmpty()) {
            int index = q.poll();// 从队列中取出一个入度为0的课程
            for (int i : map.getOrDefault(index,new ArrayList<>())) {
                in[i]--;// 这些课程的入度减1
                if (in[i] == 0) {// 如果某门课程的入度变为0，则将其加入队列
                    q.add(i);
                }
            }
            cnt--;// 处理完一门课程，未处理课程数量减1
        }
        return cnt==0;
    }
}



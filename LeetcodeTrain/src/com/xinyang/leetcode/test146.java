package com.xinyang.leetcode;

import java.util.*;

public class test146 {
}


class LRUCache {
    Deque<Integer> q=new LinkedList<>();//保证头部是最久未使用的  尾部是最新加入的(最新使用的)
    Map<Integer,Integer> map=new HashMap<>();//只有超过capity的时候 ，map中的元素删除
    int cap=0;
    public LRUCache(int capacity) {
        cap=capacity;
    }

    public int get(int key) {//使用了此元素
        if(map.containsKey(key)){
            q.remove(key);//移除出现的这个元素
            q.addLast(key);
            return map.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {
        // 如果缓存中已经存在该键，将该键从双端队列中移除，因为它的访问顺序要更新
        if(map.containsKey(key)){
            q.remove(key);
        }
        if(cap==q.size()){
            map.remove(q.pollFirst());
        }
        map.put(key,value);//加入元素
        q.addLast(key);//最新加入的 最新访问的
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
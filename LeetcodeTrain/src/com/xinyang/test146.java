package com.xinyang;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class test146 {
}


class LRUCache {
    Map<Integer,Integer> map;
    public LRUCache(int capacity) {
        map=new HashMap<>(capacity);
    }

    public int get(int key) {
        return map.getOrDefault(key,-1);
    }

    public void put(int key, int value) {
        map.merge(key,value,Integer::sum);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
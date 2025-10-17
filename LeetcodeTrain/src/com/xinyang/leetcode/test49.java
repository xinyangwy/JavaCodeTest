package com.xinyang.leetcode;

import java.util.*;

public class test49 {
    public static void main(String[] args) {
        Solution49 s=new Solution49();
        System.out.println(s.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
}

class Solution49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String str : strs) {
            char []ch=str.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            List<String> vals=map.getOrDefault(key,new ArrayList<>());
            vals.add(str);
            map.put(key,vals);
        }
        return new ArrayList<List<String>>(map.values());
    }
}

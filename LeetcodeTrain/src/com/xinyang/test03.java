package com.xinyang;

import java.util.HashMap;
import java.util.Map;

public class test03 {
    public static void main(String[] args) {
        Solution03 s=new Solution03();
        s.lengthOfLongestSubstring("abba");
    }
}


class Solution03 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int len=0;
        for(int i=0,j=0;j<s.length();j++){
            if(map.containsKey(s.charAt(j))){
                i=map.get(s.charAt(j))+1;
            }
            map.put(s.charAt(j),j);
            len=Math.max(len,j-i+1);
        }
        return len;
    }
}
package com.xinyang.leetcode;

import java.util.HashMap;
import java.util.Map;

public class test13
{
}


class Solution13 {
    public int romanToInt(String s) {
        Map<Character ,Integer> map=new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);

        int res=0;
        int n = s.length();
        char ch[]=s.toCharArray();
        for(int i=1;i<n;i++){
            int left=map.get(ch[i-1]);
            int right=map.get(ch[i]);
            res+=left<right?-left:left;
        }
        return res+map.get(ch[n-1]);
    }
}
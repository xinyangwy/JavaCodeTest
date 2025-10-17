package com.xinyang.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class test2272 {
}


class Solution2272 {
    public int largestVariance(String s) {
        char []ch=s.toCharArray();
        TreeMap<Integer,String> res=new TreeMap<>();//长度之差  字符
        Map<Character,Integer> strCnt=new HashMap<>();//字符出现的次数
        int max=0,min=10000;
        for(int r=0;r<ch.length;r++){
            for(int l=0;l<r;l++){
                strCnt.merge(ch[r],1,Integer::sum);
                max=Math.max(max,strCnt.get(ch[r]));
                min=Math.min(min,strCnt.get(ch[r]));
                res.put(max-min,s.substring(l,r+1));
            }
        }
        return res.lastKey();
    }
}
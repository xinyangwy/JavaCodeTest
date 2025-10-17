package com.xinyang.leetcode;

import java.util.HashMap;
import java.util.Map;

public class test3090 {
}


class Solution3090 {
    public int maximumLengthSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int res=0;
        for(int l=0,r=0;r<s.length();r++){//  [l,r)   保证起始的时候l=0 r=0没有元素
            char c=s.charAt(r);
            map.merge(c,1,Integer::sum);
            while(map.get(c)>2){
                map.merge(s.charAt(l),-1,Integer::sum);
                l++;
            }
            res=Math.max(res,r-l+1);//区间是左闭右开的 长度按理来说应该是r-L  但是此时r还没有++
        }
        return res;
    }
}
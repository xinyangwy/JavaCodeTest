package com.xinyang.leetcode;

import java.util.Arrays;

public class test455 {
}

class Solution455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int index=s.length-1,res=0;
        for(int i=g.length-1;i>=0;){
            if(index>=0 && s[index]>=g[i]){
                index--;
                res++;
            }
        }
        return res;
    }
}

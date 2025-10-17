package com.xinyang.leetcode;

import java.util.Arrays;

public class test567 {
}

class Solutio0567 {
    public boolean checkInclusion(String s1, String s2) {
        char []ch1=s1.toCharArray();
        int len=ch1.length;
        Arrays.sort(ch1);
        for(int l=0,r=len;r<=s2.length();l++,r++){
            String tmp=s2.substring(l,r);
            char []tmpch=tmp.toCharArray();
            Arrays.sort(tmpch);
            if(Arrays.equals(ch1,tmpch)){
                return true;
            }
        }
        return false;
    }
}
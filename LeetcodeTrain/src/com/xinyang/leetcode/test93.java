package com.xinyang.leetcode;

import java.util.*;

public class test93 {
}


class Solution93 {
    List<String> res = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        StringBuilder sb =new StringBuilder(s);
        backTracking(sb,0,0);
        return res;
    }
    private void backTracking(StringBuilder s, int startIndex, int dotCount){
        if (dotCount == 3) {
            if(isValid(s,startIndex,s.length()-1)){
                res.add(s.toString());
                return;
            }
        }
        for (int i=startIndex;i<s.length();i++){
            if(isValid(s,startIndex,i)){
                s.insert(i+1,".");
                backTracking(s,i+1,dotCount+1);
                s.deleteCharAt(i+1);
            }
        }
    }
    //[start, end]
    private boolean isValid(StringBuilder s, int start, int end){
        if(start>end)return false;
        if(start==end && s.charAt(start)=='0'){
            return false;
        }
        int num=0;
        for(int i=start;i<=end;i++){
            num=num*10+(s.charAt(i)-'0');
            if(num>255)return false;
        }
        return true;
    }
}
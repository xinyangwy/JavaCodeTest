package com.xinyang.leetcode;

import java.util.Stack;

public class test1047 {
}


class Solution1047 {
    public String removeDuplicates(String s) {
        StringBuilder res = new StringBuilder();
        int top=-1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(top==-1 || res.charAt(top) !=c){
                res.append(c);
                top++;
            }else{
                res.deleteCharAt(top);
                top--;
            }
        }
        return res.toString();
    }
}
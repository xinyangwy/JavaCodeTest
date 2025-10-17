package com.xinyang.leetcode;

public class test3340 {
}


class Solution3346 {
    public boolean isBalanced(String num) {
        char []ch=num.toCharArray();
        int sumJi=0,sumOu=0;
        for(int i=0;i<ch.length;i+=2){
            sumOu+=ch[i]-'0';
            sumJi+=ch[i+1]-'0';
        }
        return sumJi==sumOu;
    }
}
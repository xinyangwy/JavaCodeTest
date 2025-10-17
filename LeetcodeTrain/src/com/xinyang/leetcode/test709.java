package com.xinyang.leetcode;

public class test709 {
    public static void main(String[] args) {
        Solution709 s=new Solution709();
        System.out.println(s.toLowerCase("Hello"));;
    }
}


class Solution709 {
    public String toLowerCase(String s) {
        int n=s.length();
        char []ch=s.toCharArray();
        for(int i=0;i<n;i++){
            if(ch[i]>='A' && ch[i]<='Z'){
                ch[i]=(char)(ch[i]+32);
            }
        }
        return ch.toString();
    }
}
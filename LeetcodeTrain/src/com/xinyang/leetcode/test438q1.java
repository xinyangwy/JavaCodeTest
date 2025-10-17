package com.xinyang.leetcode;

public class test438q1 {
    public static void main(String[] args) {
        Solution438q1 s=new Solution438q1();
        System.out.println(s.hasSameDigits("44472"));
    }
}


class Solution438q1 {
    public boolean hasSameDigits(String s) {
        char ch[]=s.toCharArray();
        int n=ch.length;
        while(n!=2){
            for(int i=0;i<n-1;i++){
                ch[i]=(char)((ch[i]-'0'+ch[i+1]-'0')%10+'0');
            }
            n--;
        }
        return ch[0]==ch[1];
    }
}
package com.xinyang.leetcode;

import java.util.HashMap;
import java.util.Map;

public class test05 {
    public static void main(String[] args) {
        Solution05 s=new Solution05();
        System.out.println(s.longestPalindrome("babad"));
    }
}

class Solution05 {
    public String longestPalindrome(String s) {
        int n=s.length();
        Map<Integer,String> map= new HashMap<>();
        int start=0,end=0,maxLen=0;
        for (int i=0,j=0;j<n;j++){
            if(isHuiwen(s.substring(i,j+1))){
                map.put(j-i+1,s.substring(i,j+1));
                maxLen=Math.max(maxLen,j-i+1);
            }
            while(!isHuiwen(s.substring(i,j+1))){
                i++;
            }
        }
        return map.get(maxLen);
    }
    private boolean isHuiwen(String s){
        int n=s.length();
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
}
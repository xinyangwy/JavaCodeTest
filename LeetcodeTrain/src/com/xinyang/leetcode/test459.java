package com.xinyang.leetcode;

public class test459 {
    public static void main(String[] args) {
        Solution459 s=new Solution459();
        System.out.println(s.repeatedSubstringPattern("aba"));
    }
}

class Solution459 {
    public boolean repeatedSubstringPattern(String s) {
//        String str2="abc34abc2abc";
//        String[] str2s = str2.split("abc");
//        for (String strtmp:str2s) {
//            System.out.print(strtmp+";");
//        }
//        System.out.println();
//        System.out.println(str2s.length);
        for (int i = 0; i < s.length(); i++) {
            String tmp = s.substring(0, i + 1);
            String[] strs = s.split(tmp);
            if (i+1 != s.length() && strs.length == 0) {
                return true;
            }
        }
        return false;
    }
}
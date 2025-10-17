package com.xinyang;

public class test58 {
    public static void main(String[] args) {
        Solution58 s=new Solution58();
        System.out.println(s.lengthOfLastWord("   fly me   to   the moon  "));
    }
}


class Solution58 {
    public int lengthOfLastWord(String s) {
        String []strs=s.split(" ");
        return strs[strs.length-1].length();
    }
}
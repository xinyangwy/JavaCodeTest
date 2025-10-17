package com.xinyang.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class test345 {
}


class Solution345 {
    public String reverseVowels(String s) {
        int n=s.length();
        char []ch=s.toCharArray();
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        int l=0,r=n-1;
        while(l<=r){
            while(!vowels.contains(ch[l])){
                l++;
            }
            while(!vowels.contains(ch[r])){
                r--;
            }
            if(l<=r){
                char tmp=ch[l];
                ch[l]=ch[r];
                ch[r]=tmp;
            }

            l++;
            r--;
        }
        return new String(ch);
    }
}
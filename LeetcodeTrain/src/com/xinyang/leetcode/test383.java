package com.xinyang.leetcode;

import java.util.HashMap;
import java.util.Map;

public class test383 {
    public static void main(String[] args) {

    }
}


class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length() > ransomNote.length()) return false;
        int[] hash = new int[26];//默认初始全为0
        for (int i = 0; i < magazine.length(); i++) {
            hash[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            hash[ransomNote.charAt(i) - 'a']--;
            if (hash[ransomNote.charAt(i) - 'a'] < 0) return false;
        }
        return true;
    }
}
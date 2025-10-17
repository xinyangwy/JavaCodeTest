package com.xinyang.leetcode;

public class test14 {
}

class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        for (int i = 0; i < strs[0].length(); i++) {//按照第一个元素的位置排序
            for (int j = 1; j < strs.length; j++) {
                //(strs[j].length() <= i 注意这里要有等于
                if (strs[j].length() <= i || strs[j].charAt(i) != strs[0].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
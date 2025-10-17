package com.xinyang.leetcode;

public class test100531 {
    public static void main(String[] args) {
        Solution100531 s=new Solution100531();
        System.out.println(s.hasSpecialSubstring("h",1));
    }
}


class Solution100531 {
    public boolean hasSpecialSubstring(String s, int k) {
        String newS = "*" + s + "*";
        int n = newS.length();
        for (int i = 0; i <= n - k - 2; i++) {
            String tmp = newS.substring(i, i + k + 2 );
            if (isFind(tmp)) {
                return true;
            }
        }
        return false;
    }

    private boolean isFind(String s) {
        int n = s.length();
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 && s.charAt(i) == s.charAt(i + 1)) {
                return false;
            } else if (i == n - 1 && s.charAt(i) == s.charAt(i - 1)) {
                return false;
            } else if (i > 0 && i < n - 2 && s.charAt(i) != s.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

}
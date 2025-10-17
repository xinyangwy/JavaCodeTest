package com.xinyang.leetcode;

public class test09 {
}


class Solution09 {
    public boolean isPalindrome(int x) {
        String str=String.valueOf(x);
        int left=0,right=str.length()-1;
        while(left!=right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
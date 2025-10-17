package com.xinyang.leetcode;

public class test541 {
    public static void main(String[] args) {
        Solution541 solution = new Solution541();
        String s="abcdefg";
        int k=2;
        System.out.println(solution.reverseStr(s,k));;
    }
}


class Solution541 {
        public String reverseStr(String s, int k) {
            char[] chars = s.toCharArray();
            int len = chars.length;
            for (int i = 0; i < len; i+=2*k) {
                reverse(chars, i, i+k-1);
                if(i+k-1>len-1){
                    reverse(chars, i, len-1);
                    return new String(chars);
                }else if(i+2*k-1>len-1){
                    return new String(chars);
                }
            }
            return new String(chars);
        }
        private void reverse(char ch[], int start, int end) {
            for (int i = start, j = end; i < j; i++, j--) {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
            }
        }
}
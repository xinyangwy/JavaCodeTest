package com.xinyang.leetcode;

public class test712 {
    public static void main(String[] args) {
        Solution712 s=new Solution712();
        System.out.println(s.longestCommonSubsequence("abcde","ace"));
    }
}

class Solution712{
    public int minimumDeleteSum(String s1, String s2) {
        char ch1[]=s1.toCharArray();
        char ch2[]=s2.toCharArray();
        String same=longestCommonSubsequence(s1,s2);
        for (int i=0;i<same.length();i++){
            for(int j=i;j<s1.length();j++){
                if(same.charAt(i)==ch1[j]){
                    ch1[j]=0;
                }
            }
            for(int k=i;k<s2.length();k++){
                if(same.charAt(i)==ch2[k]){
                    ch1[k]=0;
                }
            }
        }
        int res=0;
        for(int i=0;i<Math.max(ch1.length, ch2.length);i++){
            res+=i<ch1.length?ch1[i]:0;
            res+=i<ch2.length?ch2[i]:0;
        }
        return res;
    }
    public String longestCommonSubsequence(String text1, String text2) {
        int len1 = text1.length();
        int len2 = text2.length();
        if (len1 == 0 || len2 == 0) return "";
        // 创建 (len1 + 1) * (len2 + 1) 的 dp 数组
        //dp[i][j] 表示字符串 text1 的前 i 个字符（即从索引 0 到 i - 1 的字符）和字符串 text2 的前 j 个字符（即从索引 0 到 j - 1 的字符）之间的最长公共子序列的长度。
        int[][] dp = new int[len1 + 1][len2 + 1];
        StringBuilder s=new StringBuilder();
        // 填充 dp 数组
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {//选
                    s.append(text1.charAt(i-1));
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {//不选
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        return s.toString();
    }
}

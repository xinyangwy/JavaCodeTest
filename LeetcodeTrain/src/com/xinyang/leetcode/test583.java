package com.xinyang.leetcode;

public class test583 {
    public static void main(String[] args) {
        System.out.println();
    }
}


class Solution583 {
    public int minDistance(String word1, String word2) {
        int len1=word1.length();
        int len2=word2.length();
        int dp[][]=new int[len1+1][len2+1];
        //以word1[i] word2[j] 结尾的连续子串   最大公共子串的长度为   dp[i][j]
        int max=0;
        for(int i=1;i<=len1;i++){
            for(int j=1;j<=len2;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][i]=dp[i-1][j-1]+1;
                    max=Math.max(dp[i][j],max);
                }
            }
        }
        return Math.max(len1,len2)-max;
    }
}
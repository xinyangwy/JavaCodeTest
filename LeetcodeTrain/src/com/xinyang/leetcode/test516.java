package com.xinyang.leetcode;

public class test516 {
}


class Solution516 {
    public int longestPalindromeSubseq(String s) {
        char ch[]=s.toCharArray();
        int [][]dp=new int[ch.length][ch.length];
        for(int i=0;i<ch.length;i++){
            dp[i][i]=1;
        }
        for(int i=ch.length-1;i>=0;i--){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    dp[i][j]=dp[i+1][j-1]+2;
                }else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i+1][j]);
                }
            }
        }
        return dp[0][ch.length-1];
    }
}
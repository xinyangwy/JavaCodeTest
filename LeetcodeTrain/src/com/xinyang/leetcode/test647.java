package com.xinyang.leetcode;

public class test647 {
}


class Solution647 {
    public int countSubstrings(String s) {
        char []ch=s.toCharArray();
        int res=0;
        boolean dp[][]=new boolean[ch.length][ch.length];
        //左闭右闭  dp[i][j]表示indexi indexj中间是回文
        //如果 ch[i]==ch[j] +  dp[i+1][j-1]是回文 那么dp[i][j]是回文
        //如果 i=j  或者 i+1=j  而且 ch[i]==ch[j] 那么 dp[i][i]也是回文  ，a   aa
        for(int i=ch.length-1;i>=0;i--){
            for(int j=i;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    if(j-i<=1){
                        dp[i][j]=true;
                        res++;
                    }else if(dp[i+1][j-1]==true){
                        dp[i][j]=true;
                        res++;
                    }
                }
            }
        }
        return res;
    }
}
package com.xinyang.leetcode;

public class test474 {

}

class Solution474 {
    public int findMaxForm(String[] strs, int m, int n) {
        int len=strs.length;
        int [][]strs01cnt=new int[len][2];
        for(int i=0;i<n;i++){
            int tmp=strs[i].length();
            for(int j=0;j<tmp;j++){
                if(strs[i].charAt(j)=='0')strs01cnt[i][0]++;
                else{
                    strs01cnt[i][1]++;
                }
            }
        }
        int dp[][]=new int[m+1][n+1];
        dp[0][0]=1;
        for(int k=0;k<len;k++){
            for(int i=0;i<=m;i++){
                for(int j=0;j<=n;j++){
                    dp[i][j]=Math.max(dp[i][j],dp[i-strs01cnt[k][0]][j-strs01cnt[k][1]]);
                }
            }
        }
        return dp[m][n];
    }
}
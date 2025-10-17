package com.xinyang.leetcode;

public class test1672 {
}


class Solution1672 {
    public int maximumWealth(int[][] accounts) {
        int n=accounts.length;
        int m=accounts[0].length;
        int res=0;
        for(int i=0;i<n;i++){
            int maxtmp =0;
            for(int j=0;j<m;j++){
                maxtmp +=accounts[i][j];
            }
            res=Math.max(res,maxtmp);
        }
        return res;
    }
}
package com.xinyang.leetcode;

public class test_q4 {
}

class Solution_q4 {
    public int beautifulNumbers(int l, int r) {
        int res=0;
        for (int i=l;i<=r;i++){
            if(isBeatuiy(i)){
                res++;
            }
        }
        return res;
    }
    private boolean isBeatuiy(int n){
        if(n==0)return false;
        if(n<=10){
            return true;
        }
        String s=Integer.toString(n);
        char ch[]=s.toCharArray();
        int ji=1,sum=0;
        for (char c : ch) {
            int x=c-'0';
            ji*=x;
        }
        for (char c : ch) {
            int x=c-'0';
            sum+=x;
        }
        if(ji%sum==0){
            return true;
        }
        return false;
    }
}

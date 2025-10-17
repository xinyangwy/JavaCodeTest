package com.xinyang.leetcode;

public class test132 {
}


class Solution132 {
    public int minCut(String s) {
        //一次分割
        int n=s.length();
        String tmp1,tmp2,tmp3;
        for(int i=0;i<=n;i++){
            tmp1=s.substring(0,i);
            tmp2=s.substring(i,n);
            if(ishuiwen(tmp1) && ishuiwen(tmp2)){
                if(i==0 || i==n)return 0;
                else{
                    return 1;
                }
            }
        }

        //一次分割
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<=n;j++){
                tmp1=s.substring(0,i);
                tmp2=s.substring(i,j);
                tmp3=s.substring(j,n);
                if(ishuiwen(tmp1) && ishuiwen(tmp2) && ishuiwen(tmp3)){
                        return 2;
                }
            }
        }

        return 0;
    }
    private boolean ishuiwen(String s){
        char []ch=s.toCharArray();
        for(int i=0;i<ch.length/2;i++){
            if(ch[i]!=ch[ch.length-1-i]){
                return false;
            }
        }
        return true;
    }

}
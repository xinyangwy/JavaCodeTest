package com.xinyang.leetcode;

public class test2595 {
}

class Solution2595 {
    public int[] evenOddBit(int n) {
        int[] res=new int[2];
        String str=Integer.toBinaryString(n);
        int len=str.length();
        for(int i=0;i<len;i++){
            if(str.charAt(i)=='1' && (len -1-i)%2==0){
                res[0]++;
            }
            if(str.charAt(i)=='1' && (len -1-i)%2==1){
                res[1]++;
            }
        }
        return res;
    }
}
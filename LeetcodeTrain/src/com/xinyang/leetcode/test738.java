package com.xinyang.leetcode;

public class test738 {
}


class Solution738 {
    public int monotoneIncreasingDigits(int n) {
        String s=Integer.toString(n);
        char []num=s.toCharArray();
        int len=s.length();
        int max=-1,index=0;
        for(int i=0;i<len-1;i++){
            if(max<num[i]){
                max=num[i];
                index=i;
            }
            if(num[i]>num[i+1]){
                num[index]--;
                for(int j=index+1;j<n;j++){
                    num[j]=9;
                }
            }
        }
        return Integer.parseInt(num.toString());
    }
}

package com.xinyang.leetcode;

public class test1247 {
}

class Solution1247 {
    public int minimumSwap(String s1, String s2) {
        if(s1.equals(s2)){
            return 0;
        }
        if(s1.length()!=s2.length()){
            return -1;
        }
        int xy=0,yx=0;
        char []ch1=s1.toCharArray();
        char []ch2=s2.toCharArray();
        for(int i=0;i<s1.length();i++){
            if(ch1[i]==ch2[i]){
                continue;
            }
            if(ch1[i]<ch2[i]){
                xy++;
            }
            if(ch1[i]>ch2[i]){
                yx++;
            }
        }
        if((xy+yx)%2==1)return -1;
        return xy/2 +yx/2 +xy%2 +yx%2;

        //  xxx(xx)x(yy)(yy)(yy)y   yyyy
        //  xxx(yy)y(xx)(xx)(xx)x   yyyy
        //       1         3      剩下的xy%2+yx%2要么是0 要么是2
    }
}
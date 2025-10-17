package com.xinyang.leetcode;

import java.util.HashMap;
import java.util.Map;

public class test12 {
}


class Solution12 {
    public String intToRoman(int num) {
        int []values=new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String []signs=new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder res=new StringBuilder();
        for(int i=0;i<7;i++){
            int numTmp=values[i];
            String str=signs[i];
            while (num>=numTmp){
                res.append(str);
                num-=numTmp;
            }
            if(num==0){
                break;
            }
        }
        return res.toString();
    }
}
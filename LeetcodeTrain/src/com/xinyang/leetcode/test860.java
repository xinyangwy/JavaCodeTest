package com.xinyang.leetcode;

public class test860 {
}

class Solution860 {
    public boolean lemonadeChange(int[] bills) {
        int cur5=0,cur10=0,cur20=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                cur5++;
            }
            if(bills[i]==10){
                cur10++;
                cur5--;
            }
            if(bills[i]==20){
                cur20++;
                if(cur10>=1){
                    cur10--;
                    cur5--;
                }else{
                    cur5-=3;
                }
            }

            if(cur5<0 || cur10<0){
                return false;
            }
        }
        return true;
    }
}
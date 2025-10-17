package com.xinyang.leetcode;

public class test657 {
}


class Solution657 {
    public boolean judgeCircle(String moves) {
        int cntU=0,cntL=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U'){
                cntU++;
            }
            if(moves.charAt(i)=='D'){
                cntU--;
            }
            if(moves.charAt(i)=='L'){
                cntL++;
            }
            if(moves.charAt(i)=='R'){
                cntL++;
            }
        }
        if(cntU==0 && cntL==0){
            return true;
        }
        return false;
    }
}
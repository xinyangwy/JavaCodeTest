package com.xinyang.leetcode;

public class test134 {
}


class Solution134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int  curSum=0,totalSum=0,index=0;
        for(int i=0;i<gas.length;i++){
            curSum+=gas[i]-cost[i];
            totalSum+=gas[i]-cost[i];
            if(curSum<0){
                index=i+1;
                curSum=0;
            }
        }
        if(totalSum<0)return -1;
        return index;
    }
}
package com.xinyang.leetcode;

public class test1491 {
}


class Solution1491 {
    public double average(int[] salary) {
        int max=3000,min=6000;
        double sum=0;
        for(int i=0;i<salary.length;i++){
            max=Math.max(max,salary[i]);
            min=Math.min(min,salary[i]);
            sum+=salary[i];
        }
        return (sum-max-min)/(int)(salary.length-2);
    }
}
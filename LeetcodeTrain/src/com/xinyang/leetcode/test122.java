package com.xinyang.leetcode;

public class test122 {
}


class Solution122 {
    public int maxProfit(int[] prices) {
        int res=0;
        for(int i=1;i<prices.length;i++){
            res+=Math.max(prices[i]-prices[i-1],0); //如果大于0就收集
        }
        return res;
    }
}
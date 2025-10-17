package com.xinyang.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LCR160 {
}


class MedianFinder {
    List<Integer> res;
    /** initialize your data structure here. */
    public MedianFinder() {
        res=new ArrayList<>();
    }

    public void addNum(int num) {
        res.add(num);
    }

    public double findMedian() {
        Collections.sort(res);
        int n=res.size();
        if(n%2==0){
            return (double)(res.get(n/2)+res.get(n/2-1))/2;
        }else{
            return res.get(n/2);
        }
    }
}
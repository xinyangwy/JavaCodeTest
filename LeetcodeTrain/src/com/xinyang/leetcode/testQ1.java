package com.xinyang.leetcode;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
public class testQ1 {
}


class SolutionQ2 {
    public int maxSum(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int max=Integer.MIN_VALUE;
        for (int num : nums) {
            if(num>0){
                set.add(num);
            }
            max=Math.max(max,num);
        }
        if(set.size()==0){
            return max;
        }
        int sum=0;
        for (Integer i : set) {
            sum+=i;
        }
        return sum;
    }
}
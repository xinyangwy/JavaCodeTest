package com.xinyang.leetcode;

import java.util.*;

public class test1002 {
}


class Solution1002 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int  fuCnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                fuCnt=i;
                break;
            }
        }
        if(k<=fuCnt){
            for(int i=0;i<k;i++){
                nums[i]=-nums[i];
            }
        }
        else if(k>fuCnt){
            for(int i=0;i<fuCnt;i++){
                nums[i]=-nums[i];
            }
            Arrays.sort(nums);
            int tmp=k-fuCnt;
            if(tmp%2==0){
                return Sum(nums);
            }
            if(tmp%2==1){
                nums[0]=-nums[0];
                return Sum(nums);
            }
        }
        return Sum(nums);
    }

    private int Sum(int []nums){
        int sum=0;
        for (int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }
}
package com.xinyang.leetcode;

public class test11 {
}



class Solution11 {
    public int maxArea(int[] height) {
        int i=0,j= height.length-1,res=0;
        while(i<j){
            if(height[i]<height[j]){
                i++;
                res=Math.max(res,(j-i)* height[i]);
            }else{
                j--;
            }
        }
        return res;
    }
}
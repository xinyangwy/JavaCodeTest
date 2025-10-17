package com.xinyang.leetcode;

public class test2614 {
}


class Solution2614 {
    public int diagonalPrime(int[][] nums) {
        int n=nums.length;//n行
        int m=nums[0].length;//m列
        int res=0;
        for(int i=0;i<n;i++){
            if(isZhi(nums[i][i])){
                res=Math.max(res,nums[i][i]);
            }
            if(isZhi(nums[i][nums.length - i - 1])){
                res=Math.max(res,nums[i][nums.length - i - 1]);
            }
        }
        return res;
    }
    private boolean isZhi(int x){
        if(x==1)return false;
        if(x<=3)return true;
        for(int i=2;i*i<=x;i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
}
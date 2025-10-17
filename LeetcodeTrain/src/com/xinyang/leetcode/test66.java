package com.xinyang.leetcode;

public class test66 {
    public static void main(String[] args) {
        Solution66 s=new Solution66();
        int []res= s.plusOne(new int[]{9,8,7,6,5,4,3,2,1,0});
        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}

class Solution66 {
    public int[] plusOne(int[] digits) {
        int sum=0;
        for(int i=0;i<digits.length;i++){
            sum=sum*10 +digits[i];
        }
        int resTmp=sum+1;
        String str=Integer.toString(resTmp);
        char []ch=str.toCharArray();
        int []res=new int[ch.length];
        for(int i=0;i<ch.length;i++){
            res[i]=ch[i]-'0';
        }
        return res;
    }
}
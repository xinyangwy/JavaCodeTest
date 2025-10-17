package com.xinyang.leetcode;

public class test2269 {
    public static void main(String[] args) {
        Solution2269 s=new Solution2269();
        System.out.println(s.divisorSubstrings(240,2));
    }
}


class Solution2269 {
    public int divisorSubstrings(int num, int k) {
        String s=""+num;
        char ch[]=s.toCharArray();
        int res=0;
        for(int left=0,right=k-1;right<ch.length;left++,right++){
            String tmp=s.substring(left,right+1);
            int numtmp=Integer.parseInt(tmp);
            System.out.println(numtmp);
            if(numtmp!=0 && num%numtmp==0){
                res++;
            }
        }
        return res;
    }
}
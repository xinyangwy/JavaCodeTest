package com.xinyang.leetcode;

import java.util.HashSet;
import java.util.Set;

public class test202 {
    public static void main(String[] args) {
        int n=19;
        Solution202 solution202 = new Solution202();
        System.out.println(solution202.isHappy(n));
    }
}

class Solution202 {
    public boolean isHappy(int n){
        Set<Integer> set = new HashSet<>();
        while(n!=1 && !set.contains(n)){
            set.add(n);
            n=getNextNum(n);
        }
        return n==1;
    }
    private int getNextNum(int n){
        int res=0;
        while(n!=0){
            int tmp=n%10;
            res += tmp*tmp;
            n=n/10;
        }
        return res;
    }

//    public boolean isHappy(int n) {
//        int loop=0;
//        while(n!=1){
//            String str = n+"";
//            int length=str.length();
////        System.out.println(length);
//            int []num=new int[length];
//            n=0;
//            for(int i=0;i<length;i++){
//                num[i]=str.charAt(i)-'0';
//                n+=num[i]*num[i];
//            }
//            loop++;
//            if(loop==999999){
//                return false;
//            }
//        }
//        return true;
//    }
}

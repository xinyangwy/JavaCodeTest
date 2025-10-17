package com.xinyang.leetcode;

public class test1768 {
}

//
//class Solution1768 {
//    public String mergeAlternately(String word1, String word2) {
//        char ch1[]=word1.toCharArray();
//        char ch2[]=word2.toCharArray();
//        int len1=word1.length();
//        int len2=word2.length();
//        String res="";
//        int i=0,j=0;
//        while(i<len1 && j<len2){
//            res+=ch1[i++];
//            res+=ch2[j++];
//        }
//        while(i<len1){
//            res+=ch1[i++];
//        }
//        while(i<len1){
//            res+=ch2[j++];
//        }
//        return res;
//    }
//}

//class Solution {
//    public char findTheDifference(String s, String t) {
//        for (int i = 0; i < t.length(); i++) {
//            if (!s.contains(t.charAt(i))) {
//                return t.charAt(i);
//            }
//        }
//        return s.charAt(0);
//    }
//}

class Solution1768 {
    public void moveZeroes(int[] nums) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index++]=nums[i];
            }
        }
        for(int i=index+1;i<nums.length;i++){
            nums[index++]=0;
        }

    }
}
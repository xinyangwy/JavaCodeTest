package com.xinyang.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class test349 {
    public static void main(String[] args) {
        Solution349 solution = new Solution349();
    }
}


class Solution349 {
        public int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer> set1 = new HashSet<>();
            for(int num: nums1){
                set1.add(num);
            }
            Set<Integer> set2 = new HashSet<>();
            for(int num: nums1){
                if(set1.contains(num)){
                    set2.add(num);
                }
            }
            int [] res = new int[set2.size()];
            int index = 0;
            for(int num: set2){
                res[index++] = num;
            }
            return res;
        }

//    public int[] intersection(int[] nums1, int[] nums2) {
//        int []hash1 = new int[nums1.length];
//        int []hash2 = new int[nums2.length];
//        for (int i = 0; i < nums1.length; i++) {
//            hash1[nums1[i]]++;
//        }
//        for (int i = 0; i < nums2.length; i++) {
//            hash2[nums2[i]]++;
//        }
//        ArrayList<Integer> resTmp = new ArrayList<>();
//        for (int i = 0; i < hash1.length; i++) {
//            if (hash1[i] >0&&  hash2[i]>0) {
//                resTmp.add(i);
//            }
//        }
//        int[] res = new int[resTmp.size()];
//        for (int i = 0; i < res.length; i++) {
//            res[i] = resTmp.get(i);
//        }
//        return res;
//    }
}
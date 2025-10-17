package com.xinyang.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class test496 {
}


class Solution496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map=new HashMap<>();
        Stack<Integer> stack=new Stack<>();
        stack.push(nums2[0]);
        int n=nums2.length;
        for(int i=1;i<n;i++){
            if(nums2[i]<= stack.peek()){
                stack.push(nums2[i]);
            }
            else{
                while(!stack.isEmpty() &&  nums2[i]> stack.peek()){
                    map.put(stack.peek(),nums2[i]);
                    stack.pop();
                }
                stack.push(nums2[i]);
            }
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i]=map.getOrDefault(nums1[i],-1);
        }
        return nums1;
    }
}
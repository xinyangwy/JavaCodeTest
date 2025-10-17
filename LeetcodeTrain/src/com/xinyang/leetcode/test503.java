package com.xinyang.leetcode;

import java.util.Arrays;
import java.util.Stack;

public class test503 {
}

class Solution503 {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int []nums2=new int[n*2];
        for(int i=n;i<nums2.length;i++){
            nums2[i]=nums[i-n];
        }
        Arrays.fill(nums,-1);
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        for(int i=1;i<nums2.length;i++){
            if(nums2[i]<= nums2[stack.peek()]){
                stack.push(nums2[i]);
            }else{
                while (!stack.isEmpty() && nums2[i]> nums2[stack.peek()]){
                    if(stack.peek()<n) nums[stack.peek()]=nums2[i];
                    stack.pop();
                }
                stack.push(i);
            }
        }
        return nums;
    }
}

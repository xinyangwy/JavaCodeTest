package com.xinyang.leetcode;

import java.util.Stack;

public class test42 {
}


//class Solution42 {
//    public int trap(int[] height) {
//        int n=height.length;
//        int []maxLh=new int[n];//i以及i左边的最大高度
//        int []maxRh=new int[n];//i以及i右边的最大高度
//        maxLh[0]=height[0];
//        for(int i=1;i<n;i++){
//            maxLh[i]=Math.max(height[i],maxLh[i-1]);
//        }
//        maxRh[0]=height[n-1];
//        for(int i=n-2;i>=0;i--){
//            maxRh[i]=Math.max(height[i],maxRh[i-1]);
//        }
//        int sum=0;
//        for(int i=2;i<n-2;i++){
//            int s=Math.min(maxLh[i],maxRh[i])-height[i];
//            sum+=s;
//        }
//        return sum;
//    }
//}

class Solution42 {
    public int trap(int[] height) {
        Stack<Integer> s=new Stack<>();
        int  n=height.length;
        if(n<=2)return 0;
        s.push(0);
        int sum=0;
        for(int i=1;i<n;i++){
            if(height[i]<=height[s.peek()]){
                s.push(i);
            }else{
                while(!s.isEmpty() && height[i]>s.peek()){
                    int mid=height[s.peek()];
                    s.pop();
                    sum+=(Math.min(height[s.peek()],height[i])-mid)*(i-s.peek()-1);
                }
                s.push(i);
            }
        }
        return sum;
    }
}
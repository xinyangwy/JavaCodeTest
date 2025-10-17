package com.xinyang.leetcode;

import java.awt.*;
import java.util.Stack;

public class test734 {
}


//class Solution734 {
//    public int[] dailyTemperatures(int[] temperatures) {
//        int n= temperatures.length;
//        int answers[]=new int[n];
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                if(temperatures[j]>temperatures[i]){
//                    answers[i]=j-i;
//                }
//            }
//        }
//        return answers;
//    }
//}


class Solution734 {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answers = new int[n];
        Stack<Integer> stk = new Stack<>();
        stk.push(0);
        for (int i = 1; i < n; i++) {
            if (temperatures[i] <= temperatures[stk.peek()]) {
                stk.push(i);
            } else {
                while (!stk.isEmpty() && temperatures[i] > temperatures[stk.peek()]) {
                    answers[stk.peek()] = i - stk.peek();
                    stk.pop();//注意先answers 再pop
                }
                stk.push(i);//注意这个不在while里面
            }

        }
        return answers;
    }
}
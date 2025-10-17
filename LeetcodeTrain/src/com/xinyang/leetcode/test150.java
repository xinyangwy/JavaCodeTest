package com.xinyang.leetcode;

import java.util.Stack;



class Solution150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        for (String i : tokens) {
            if (i.equals("+")) {
                stack.push(stack.pop()+stack.pop());
            } else if (i.equals("-")) {
                stack.push(-stack.pop()+stack.pop());
            } else if (i.equals("*")) {
                stack.push(stack.pop()*stack.pop());
            }else if (i.equals("/")) {
                int tmp1 = stack.pop();
                int tmp2 = stack.pop();
                stack.push(tmp2/tmp1);
            }else{
                stack.push(Integer.parseInt(i));
            }
        }
        return stack.pop();
    }
}

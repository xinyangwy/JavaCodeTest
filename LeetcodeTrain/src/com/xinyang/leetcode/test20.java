package com.xinyang.leetcode;

import java.util.Stack;

public class test20 {
    public static void main(String[] args) {
        Solution20 solution20 = new Solution20();
        System.out.println(solution20.isValid("()"));
    }
}


class Solution20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                stack.push(')');
            }else if(s.charAt(i) == '['){
                stack.push(']');
            }else if(s.charAt(i) == '{'){
                stack.push('}');
            } else if (stack.isEmpty() || stack.peek()!=s.charAt(i)) {
                return false;
            }else{
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

}
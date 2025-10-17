package com.xinyang.leetcode;

import java.util.Stack;

public class test232 {
}


class MyQueue {
    Stack<Integer> stackIn;
    Stack<Integer> stackOut;
    public MyQueue() {
        stackIn=new Stack<>();
        stackOut=new Stack<>();
    }

    public void push(int x) {
        stackIn.push(x);
    }

    public int pop() {
        if(stackOut.empty()){
            if(stackIn.empty()){
                return -1;
            }else{
                while(!stackIn.empty()){
                    stackOut.push(stackIn.pop());
                }
            }
        }
        return stackOut.pop();
    }

    public int peek() {
        if(stackOut.empty()){
            if(stackIn.empty()){
                return -1;
            }else{
                while(!stackIn.empty()){
                    stackOut.push(stackIn.pop());
                }
            }
        }
        return stackOut.peek();
    }

    public boolean empty() {
        if(stackOut.empty() && stackIn.empty()){
            return true;
        }
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
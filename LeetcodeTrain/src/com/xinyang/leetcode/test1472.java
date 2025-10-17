package com.xinyang.leetcode;

import java.util.ArrayList;
import java.util.List;

public class test1472 {
}


class BrowserHistory {
    //final 用于修饰变量时，表示该变量是一个常量，一旦被赋值后就不能再被重新赋值。
    private final List<String> history=new ArrayList<>();
    private int cur=0;
    public BrowserHistory(String homepage) {
        history.add(homepage);
    }

    public void visit(String url) {
        cur++;
        history.subList(cur,history.size()).clear();
        history.add(url);
    }

    public String back(int steps) {
        cur=Math.max(cur-steps,0);
        return history.get(cur);
    }

    public String forward(int steps) {
        cur=Math.max(cur+steps,history.size()-1);
        return history.get(cur);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
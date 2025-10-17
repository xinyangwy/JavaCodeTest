package com.xinyang.demo3;

public class CoBrRe {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 2) {
//                continue;
//                break;
                return;
            }
            System.out.println("正在执行循环");
        }
        System.out.println("已经退出循环");
    }
}

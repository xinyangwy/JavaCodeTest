package com.xinyang.demo3;

public class PrintAtoZ {
    public static void main(String[] args) {
        //a-z  Z-A
        for (char c= 'a'; c < 'z'; c++) {
            System.out.print(c+" ");
        }
        System.out.println();
        for (char c='A'; c < 'Z'; c++) {
            System.out.print(c+" ");
        }
    }
}

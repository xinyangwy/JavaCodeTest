package com.xinyang.demo3;

import java.util.Scanner;

public class SwitchUse {
    public static void main(String[] args) {
        System.out.println("请输入a-g：");
        Scanner scanner = new Scanner(System.in);
        char c=scanner.next().charAt(0);
        switch (c){
            case 'a':
                System.out.println("星期一");
                break;
            case 'b':
                System.out.println("星期二");
                break;
            case 'c':
                System.out.println("星期三");
                break;
            case 'd':
                System.out.println("星期四");
                break;
            case 'e':
                System.out.println("星期五");
                break;
        }
        System.out.println("退出");
    }
}

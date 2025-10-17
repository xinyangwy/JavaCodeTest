package com.xinyang.demo2;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入你的年龄：");
        int age=scanner.nextInt();
        System.out.println("您的年龄："+age);
        System.out.println("输入你的工资：");
        double wage=scanner.nextDouble();
        System.out.println("您的工资："+wage);

    }
}

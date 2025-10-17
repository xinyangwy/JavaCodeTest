package com.xinyang.demo1;

public class Var {
    public static void main(String[] args) {
        int a=100;
        int b=100;
        String str="一百";
        System.out.println(a);
        System.out.println("---------------");
        System.out.println(a+b);
        System.out.println("---------------");
        System.out.println(a-b);
        System.out.println("---------------");
        System.out.println(a/b);
        System.out.println("---------------");
        System.out.println(a*b);
        System.out.println("---------------");
        System.out.println(a+str);//字符串拼接   100一百
        System.out.println("---------------");
        System.out.println(str+100);
        System.out.println("---------------");
        System.out.println(100+str);
        System.out.println("---------------");
        System.out.println(str+100+3);//一百1003
        System.out.println("---------------");
        System.out.println(100+3+str);//103一百
        System.out.println("---------------");
    }
}

package com.xinyang.demo2;

public class Operator {
    public static void main(String[] args) {
        int i = 10;
        i+=4;
        System.out.println(i);
        byte b = 10;
//        b+=4; //对的
//        b=b+4;//编译报错
        b=(byte)(b+4);
        System.out.println(b);
        System.out.println("----------------");
        int c=1;
        int d=2;
        int e=3;
//        int max=c>d?c:d;
//        max=max>e?max:e;
        int max=(c>d?c:d)>e?(c>d?c:d):e;
        System.out.println(max);
    }
}

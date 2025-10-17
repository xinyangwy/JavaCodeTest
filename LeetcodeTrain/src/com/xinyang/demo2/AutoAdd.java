package com.xinyang.demo2;

public class AutoAdd {
    public static void main(String[] args) {
        int i=1;
        int j=i++;
        System.out.println(j+"\n"+i);
        System.out.println("---------------");

        int a=1;
        int b=++a;
        System.out.println(b+"\n"+a);
        System.out.println("---------------");

        int c=1;//c1=1
        c=c++;//c2=c1=1  c1=c1+1=2  c1=c2=1
        System.out.println(c);
    }
}

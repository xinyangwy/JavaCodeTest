package com.xinyang.demo4;

public class OverloadMethod {
    public static void main(String[] args) {
        Num3 num3 = new Num3();
        num3.add(1,2);
        num3.add(1,2,3);
        num3.add(1,2.0);
    }
}
class Num3{
    //改变个数类型或者顺序
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    void add(int a,double b){
        System.out.println(a+b);
    }


}


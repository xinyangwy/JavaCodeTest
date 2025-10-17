package com.xinyang.demo1;

public class ForcrConvert {
    public static void main(String[] args) {
        //char int long double
        //byte short int float double
        int i=(int)1.9;
        byte b=(byte)2000;
        System.out.println(i);//精度丢失
        System.out.println(b);//数据溢出
    }
}

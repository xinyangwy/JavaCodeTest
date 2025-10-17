package com.xinyang.demo1;

public class StingConvert {
    public static void main(String[] args) {
        //int double float char
        int i=10;
        double d=10.0;
        float f=10.0f;
//        String s1=i; //报错
        String s1=i+"";
        String s2=d+"";
        String s3=f+"";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        //string类型转为int double float
        String S1="456";
        //转换成int
        int i1=Integer.parseInt(S1);
        //转换成double
        double d1 = Double.parseDouble(S1);
        //转换成float
        float f1=Float.parseFloat(S1);
        System.out.println(i1);
        System.out.println(d1);
        System.out.println(f1);
        //转换成char
        System.out.println(S1.charAt(0));
        System.out.println(S1.charAt(1));
        System.out.println(S1.charAt(2));
    }
}

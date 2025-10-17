package com.xinyang.demo2;

public class DevUse {
    public static void main(String[] args) {
        System.out.println(10/3);//int/int
        System.out.println(10.0/3);//double/int
        double a=10/3;//得到的先是int类型的3，然后再被自动转换成double类型的3.0
        System.out.println(a);
        //a%b=a-(a/b*b)
        System.out.println("-------------");
        System.out.println(10%3);
        //10%3=10-(10/3*3)=10-（3*3）=1
        System.out.println((-10)%3);
        //a%b=a-(a/b*b)
        System.out.println(10%(-3));
        //a%b=a-(a/b*b)
        System.out.println((-10)%(-3));
        //-10%-3=-10-(-10/-3*-3)=-10- -9=-1
    }
}

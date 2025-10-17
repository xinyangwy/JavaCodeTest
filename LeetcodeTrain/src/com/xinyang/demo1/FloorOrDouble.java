package com.xinyang.demo1;

public class FloorOrDouble {
    public static void main(String[] args) {
        double n1 = 3.1415926535;
        float n2 = 3.1415926535f;
        System.out.println(n1+"\n"+n2);

        double num1 = 2.7;
        double num2 = 8.1/3;//有些带小数的十进制不能正确的转换为二进制，会有精度的损失
        System.out.println(num1==num2);
        System.out.println(num1 +"\n"+num2);
        if(Math.abs(num1-num2)<0.00001){
            System.out.println("相等");
        }else {
            System.out.println("不相等");
        }
    }
}

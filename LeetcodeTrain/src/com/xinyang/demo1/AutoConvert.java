package com.xinyang.demo1;

public class AutoConvert {
    public static void main(String[] args) {
        //char int long double
        //byte short int float double
        double d1=100;//100.0
        int i1='a';//97
        System.out.println(d1);
        System.out.println(i1);

        System.out.println("-------------");
        int i2=100;
        double d2=100;
        float f2=10.1f;//有些带小数的十进制不能正确的转换为二进制，会有精度的损失  。 有些小数IEEE754不能精确表示
        System.out.println(i2+f2+d2);//输出值的类型取决于那个的类型精度最高，double   210.0999984741211

//        int i3=i2+f2+d2;
//        System.out.println(i3);//java: 不兼容的类型: 从double转换到int可能会有损失
    }
}

package com.xinyang.demo4;

public class DiguiMethod2 {
    public static void main(String[] args) {
        Num2 num = new Num2();
        System.out.println(num.method2(5));
    }
}

class Num2{
    public int method2(int n){
        if(n==1){
            return 1;
        }else{
            return n*method2(n-1);
        }
    }

}

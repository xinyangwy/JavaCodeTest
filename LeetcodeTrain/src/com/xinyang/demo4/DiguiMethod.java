package com.xinyang.demo4;

public class DiguiMethod {
    public static void main(String[] args) {
        Num num = new Num();
        num.method(4);
    }
}

class Num{
    void method(int n){
        if(n>2){
            method(n-1);
        }
        System.out.println("n="+n);
    }
}

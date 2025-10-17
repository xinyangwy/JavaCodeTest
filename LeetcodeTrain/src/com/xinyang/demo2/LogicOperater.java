package com.xinyang.demo2;

public class LogicOperater {
    public static void main(String[] args) {
        //& &&     与      乘法        如果相对应位都是1，则结果为1，否则为0
        // | ||    或	   加法        如果相对应位都是 0，则结果为 0，否则为 1
        // ！       非      取反
        // ^       异或     不一样就是1   如果相对应位值相同，则结果为0，否则为1
        boolean b1=true;
        boolean b2=false;
        boolean b3=true;
        boolean b4=false;
        if(b1&&b3){
            System.out.println("b1==b2");
        }
        System.out.println("-----------------------");
        //注意：短路与&&  （效率高 常用）
        int i=20;
        if(i<10 && i++>20){//i<10不成立就不会执行后面的i++>20
            System.out.println("对");
        }
        System.out.println(i);
        System.out.println("-----------------------");
        //注意：逻辑与&
        int j=20;
        if(j<10 & j++>20){//i<10不成立 但是依旧  执行后面的i++>20
            System.out.println("对");
        }
        System.out.println(j);
    }
}

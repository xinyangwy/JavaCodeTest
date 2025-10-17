package com.xinyang.demo4;

public class AddMethod {
    //add(int... nums)
    public static void main(String[] args) {
        Num4 num4 = new Num4();
        num4.add(1,2);
        num4.add(1,2,3);
        num4.add(1.0,2,3);
    }
}
class Num4{
    void add(int... nums){
        int res = 0;
        for(int num : nums){
            res += num;
        }
        System.out.println(res);
    }
    void add(double d,int... nums){
        int res = 0;
        for(int num : nums){
            res += num;
        }
        System.out.println(d+res);
    }
}


package com.xinyang.demo3;

public class WaterNum {
    public static void main(String[] args) {
        //水仙花数  153=1*1*1+5*5*5+3*3*3
        for(int i=100;i<1000;i++){
            int HumNum=i/100;
            int TenNum=i/100%10;
            int OneNum=i%10;
            if(HumNum*HumNum*HumNum+TenNum*TenNum*TenNum+OneNum*OneNum*OneNum==i){
                System.out.println(i+"是水仙花数");
            }else {
                continue;
            }
        }
    }
}

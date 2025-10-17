package com.xinyang.demo3;

public class ArrNum {
    public static void main(String[] args) {
        //浅拷贝  Me复制的是地址 硬链接
        String[] You={"你","你爸爸","你妈妈"};
        String[] Me =You;
        System.out.println(You[0]+"\t"+You[1]+"\t"+You[2]);
        System.out.println(You[0]+"\t"+You[1]+"\t"+You[2]);
        Me[0]="不是你了，已经变成我了";//Me的改动影响了You
        System.out.println("-------------------");
        System.out.println(You[0]+"\t"+You[1]+"\t"+You[2]);
        System.out.println(You[0]+"\t"+You[1]+"\t"+You[2]);
        //对于int类型
        int n1 = 100;
        int n2 = n1;
        n2=200;//n2的改动不影响n1
        System.out.println(n1+"\t"+n2);
    }
}

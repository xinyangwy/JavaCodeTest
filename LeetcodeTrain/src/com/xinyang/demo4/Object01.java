package com.xinyang.demo4;

public class Object01 {
    public static void main(String[] args) {
        //引用 复制，类似数组的浅拷贝
        Person XiaoMing = new Person();
        XiaoMing.name="小明";
        XiaoMing.age=18;
        Person TieDan = new Person();
        TieDan=XiaoMing;
        System.out.println(TieDan.name+":"+TieDan.age);
        System.out.println("----------");
        TieDan.name="铁蛋";
        System.out.println(XiaoMing.name+":"+XiaoMing.age);
    }
}

class Person {
    String name;
    int age;
}

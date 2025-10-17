package com.xinyang.demo5;

public class Constructor {
    //构造器
    public static void main(String[] args) {
        Person2 person2 = new Person2("小明",18);
        Person2 person3 = new Person2("大明");
        System.out.println(person2.name+"\t"+person2.age);
        System.out.println(person3.name+"\t"+person3.age);
    }
}
class Person2 {
    String name;
    int age;
    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person2(String name) {
        this.name = name;
        this.age = age;
    }
}
package com.xinyang.demo4;

public class ObjectMethod {
    public static void main(String[] args) {
        Person02 person02 = new Person02();
        person02.age=20;
        person02.name="jerry";
        person02.method(person02);//没有这行的话  20	jerry；  有这行  18	Tom
        System.out.println(person02.age+"\t"+person02.name);
    }
}
class Person02 {
    String name;
    int age;
    void method(Person02 p) {
        p.name="Tom";
        p.age=18;
    }
}

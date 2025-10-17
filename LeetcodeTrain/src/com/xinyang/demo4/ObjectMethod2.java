package com.xinyang.demo4;

public class ObjectMethod2 {
    public static void main(String[] args) {
        Person02 person02 = new Person02();
        person02.age=20;
        person02.name="jerry";
        person02.method(person02);//这里修改了method的指针，不影响person02
        System.out.println(person02.age+"\t"+person02.name);
    }
}
class Person03 {
    String name;
    int age;
    void method(Person02 p) {
        p=null;
    }
}

package com.xinyang.leetcode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
public class tests1 {
}
//
//
//
//
//// 员工类，作为其他三个类的父类
//class Employee {
//    protected String name;
//    protected String department;
//    protected int age;
//    protected double salary;
//
//    public Employee(String name, String department, int age, double salary) {
//        this.name = name;
//        this.department = department;
//        this.age = age;
//        this.salary = salary;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getDepartment() {
//        return department;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{name='" + name + "', department='" + department + "', age=" + age + ", salary=" + salary + "}";
//    }
//}
//
//// 经理类
//class Manager extends Employee {
//    private List<Employee> employees;
//
//    public Manager(String name, String department, int age, double salary) {
//        super(name, department, age, salary);
//        this.employees = new ArrayList<>();
//    }
//
//    // 查看员工信息
//    public String inquires(Employee e) {
//        if (this.department.equals(e.getDepartment())) {
//            return e.toString();
//        }
//        return "无权查看其他部门员工信息";
//    }
//
//    // 把员工添加到自己领导的小组
//    public boolean lead(Employee e) {
//        if (this.department.equals(e.getDepartment())) {
//            employees.add(e);
//            return true;
//        }
//        return false;
//    }
//}
//
//// 程序猿类
//class Programmer extends Employee {
//    private String type;
//    private ProgrammerPosition position;
//
//    public enum ProgrammerPosition {
//        DEVELOP, UI, TEST
//    }
//
//    public Programmer(String name, String department, int age, double salary, String type, ProgrammerPosition position) {
//        super(name, department, age, salary);
//        this.type = type;
//        this.position = position;
//    }
//
//    // 计算奖金
//    public String getBonus(int overtime) {
//        double baseBonus = 0;
//        double overtimeBonus = 0;
//        double maxOvertimeBonus = 0;
//        double overtimeRate = 0;
//
//        switch (position) {
//            case DEVELOP:
//                baseBonus = salary * 0.2;
//                overtimeRate = 100;
//                maxOvertimeBonus = 500;
//                break;
//            case UI:
//                baseBonus = salary * 0.25;
//                overtimeRate = 50;
//                maxOvertimeBonus = 300;
//                break;
//            case TEST:
//                baseBonus = salary * 0.15;
//                overtimeRate = 150;
//                maxOvertimeBonus = 1000;
//                break;
//        }
//
//        overtimeBonus = Math.min(overtime * overtimeRate, maxOvertimeBonus);
//        double totalBonus = baseBonus + overtimeBonus;
//
//        DecimalFormat df = new DecimalFormat("#.00");
//        return df.format(totalBonus);
//    }
//}
//
//// 保安类
//class Security extends Employee {
//    private String area;
//
//    public Security(String name, String department, int age, double salary, String area) {
//        super(name, department, age, salary);
//        this.area = area;
//    }
//}
//
//public class CompanySystem {
//    public static void main(String[] args) {
//        // 创建员工对象
//        Programmer programmer1 = new Programmer("张三", "程序猿部", 25, 8000, "Java", Programmer.ProgrammerPosition.DEVELOP);
//        Programmer programmer2 = new Programmer("李四", "程序猿部", 26, 7500, "C", Programmer.ProgrammerPosition.TEST);
//        Security security1 = new Security("王五", "保安部", 30, 3500, "A");
//        Security security2 = new Security("赵六", "保安部", 32, 3800, "B");
//
//        // 创建经理对象
//        Manager programmerManager = new Manager("孙七", "程序猿部", 35, 12000);
//        Manager securityManager = new Manager("周八", "保安部", 40, 5000);
//
//        // 经理查看员工信息
//        System.out.println(programmerManager.inquires(programmer1));
//        System.out.println(securityManager.inquires(security1));
//
//        // 经理尝试添加员工到自己的小组
//        System.out.println(programmerManager.lead(programmer1));
//        System.out.println(securityManager.lead(security1));
//
//        // 程序猿计算奖金
//        System.out.println("程序员1的奖金: " + programmer1.getBonus(3));
//        System.out.println("程序员2的奖金: " + programmer2.getBonus(5));
//    }
//}
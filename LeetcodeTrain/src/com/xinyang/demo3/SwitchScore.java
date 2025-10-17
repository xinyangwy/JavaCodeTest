package com.xinyang.demo3;

import java.util.Scanner;

public class SwitchScore {
    public static void main(String[] args) {
        System.out.println("请输入你的成绩：");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        //case后面跟的不是条件 和if不同  case:59
        if(score>=0 && score<=100){
            switch ((int)score/60){
                case 0:
                    System.out.println("成绩不合格");
                    break;
                case 1:
                    System.out.println("成绩合格");
                    break;
            }
            System.out.println("退出");
        }else{
            System.out.println("输入的成绩有误");
            System.out.println("退出");
        }
    }
}

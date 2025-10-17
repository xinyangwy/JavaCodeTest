package com.xinyang.leetcode;

import java.util.Scanner;

public class testk10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNextInt()){
            int m= sc.nextInt();
            int k=sc.nextInt();
            if(m==0 && k==0)break;
            System.out.println(day(m,k));
        }
    }
    private static int day(int m, int k){
        int sum=m;
        while(m>=k){
            sum+=m/k;
            m=m%k+m/k;
        }
        return sum;
    }
}


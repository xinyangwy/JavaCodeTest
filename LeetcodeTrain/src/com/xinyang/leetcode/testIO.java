package com.xinyang.leetcode;

import javax.crypto.spec.PSource;
import java.util.*;

public class testIO {
    //    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        while(in.hasNext()){
//            int a=in.nextInt();
//            int b=in.nextInt();
//            System.out.println(a+b);
//        }
//    }

//    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        while(in.hasNext()){
//            int n=in.nextInt();
//            while(n-->0){
//                int a=in.nextInt();
//                int b=in.nextInt();
//                System.out.println(a+b);
//            }
//        }
//    }

//    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        while(in.hasNext()){
//            int a=in.nextInt();
//            int b=in.nextInt();
//            if(a==0 &&b==0){
//                break;
//            }
//            System.out.println(a+b);
//        }
//    }

//
//    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        while (in.hasNext()){
//            int n=in.nextInt();
//            if(n==0){
//                break;
//            }
//            int sum=0;
//            for(int i=0;i<n;i++){
//                sum+=in.nextInt();
//            }
//            System.out.println(sum);
//        }
//    }


//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        while (sc.hasNextLine()){
//            int a=sc.nextInt();
//            int b=sc.nextInt();
//            System.out.println(a+b);
//            System.out.println();
//        }
//    }


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        while (sc.hasNextLine()) {
//            int n = sc.nextInt();
//            while (n-- > 0) {
//                int m = sc.nextInt();
//                int sum = 0;
//                while (m-- > 0) {
//                    sum += sc.nextInt();
//                }
//                System.out.println(sum);
//                if (n > 0) System.out.println();
//            }
//
//        }
//    }


//    public static void main(String[] args) {
//        Map<String,Integer> map=new HashMap<>();
//        map.put("A",4);
//        map.put("B",3);
//        map.put("C",2);
//        map.put("D",1);
//        map.put("F",0);
//
//        Scanner sc=new Scanner(System.in);
//        while (sc.hasNextLine()){
//            String str=sc.nextLine();
//            String []items=str.trim().split(" ");
//            double sum=0;
//            boolean flag=false;
//            for(String item:items){
//                if(!map.containsKey(item)){
//                    flag= true;
//                }
//                sum+=map.get(item);
//            }
//            if(flag==true){
//                break;
//            }
//            System.out.printf("%.2f\n",sum/items.length);
//        }
//    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNextLine())
        {
            String str=sc.nextLine();
            char ch[]=str.toCharArray();
            int sum=0;
            for(int i=0;i<ch.length;i++){
                if((ch[i]-'0')%2==0){
                    sum+=(ch[i]-'0');
                }
            }
            System.out.println(sum);
            System.out.println();
        }
    }

}



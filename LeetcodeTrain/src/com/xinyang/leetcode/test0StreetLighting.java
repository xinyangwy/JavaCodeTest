package com.xinyang.leetcode;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class test0StreetLighting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        int N = sc.nextInt();
        List<Integer> lights = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            lights.add(sc.nextInt());
        }
        System.out.println(minLights(L, R, N,lights));
    }

    public static int minLights(int L, int R,int N, List<Integer> lights) {
        int curend=0;//在哪个范围内寻找路灯
        int cnt=0,i=0; // i 当前遍历到的路灯索引
        //i lights的下标    pos 路灯的位置
        while(curend<L){
            int pos=-1;//寻找能覆盖当前区域的最远路灯 （已覆盖的curend+index照亮的左边半径R ）
            while(i<N && lights.get(i)<=curend+R){
                pos=lights.get(i);//注意这里寻找pos的操作 ，不断更新pos
                i++;//此时++的 i进入下一层的循环
            }
            if(pos==-1){
                return -1;
            }
            curend=pos+R;
            cnt++;

            if(curend>=L){
                break;
            }
        }
        return curend >= L ? cnt : -1;
    }
}

//
//import java.util.Collections;
//
//public class test0StreetLighting {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int L = sc.nextInt();
//        int R = sc.nextInt();
//        int N = sc.nextInt();
//        ArrayList<Integer> lamps = new ArrayList<>();
//        for (int i = 0; i < N; i++) {
//            lamps.add(sc.nextInt());
//        }
//        sc.close();
//
//        System.out.println(minLamps(L, R, lamps));
//    }
//
//    public static int minLamps(int L, int R, ArrayList<Integer> lamps) {
//        Collections.sort(lamps); // 将路灯按位置排序
//        int currentEnd = 0;      // 当前覆盖到的最右端
//        int count = 0;           // 使用的路灯数量
//        int i = 0;               // 当前遍历到的路灯索引
//        int n = lamps.size();
//
//        while (currentEnd < L) {
//            int farthest = -1;
//            // 寻找能覆盖当前区域的最远路灯
//            while (i < n && lamps.get(i) <= currentEnd + R) {
//                farthest = lamps.get(i);
//                i++;
//            }
//            if (farthest == -1) { // 没有可用的路灯，无法覆盖
//                return -1;
//            }
//            count++;
//            currentEnd = farthest + R; // 更新覆盖的最右端
//            if (currentEnd >= L) {     // 已覆盖整个路
//                break;
//            }
//        }
//        return currentEnd >= L ? count : -1;
//    }
//}
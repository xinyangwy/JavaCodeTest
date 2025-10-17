package com.xinyang.demo3;

public class ArrayMax {
    public static void main(String[] args) {
        int []arr = {1,5,3,-63,100,500};
        int Max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (Max < arr[i]) {
                Max = arr[i];
            }
        }
        System.out.println("arr数组中最大值:" + Max);
    }
}

package com.xinyang.demo3;

public class ArrCopy {
    public static void main(String[] args) {
        int[] arr1= {0,1,2};
        int[] arr2=new int[arr1.length];
//        arr2=arr1;//如果这样复制的话，之后arr2的改动会影响到arr1
        for(int i=0;i<arr1.length;i++){
            arr2[i]=arr1[i];
        }
        for (int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
}

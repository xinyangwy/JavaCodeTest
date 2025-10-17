package com.xinyang.demo4;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={55,66,44,22,11};
        int n=arr.length;
        boolean swapped;
        // 外层循环控制遍历次数
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            // 内层循环进行相邻元素的比较和交换
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {//如果起哪一个大于后一个，那就交换   第一次，最后一个元素的位置被确定
                    // 交换元素
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // 如果在这一轮遍历中没有发生交换，说明数组已经有序，提前结束
            if (!swapped) {
                break;
            }
        }
        // 辅助方法，用于打印数组
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

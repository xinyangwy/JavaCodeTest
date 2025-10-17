package com.xinyang.demo3;

public class GoldTown {
    //                *   空格
    //     *          1    5
    //    ***         3    4
    //   *****        5    3
    //  *******       7    2
    // *********      9    1
    public static void main(String[] args) {
        int n=6;
        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

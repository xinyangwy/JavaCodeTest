package com.xinyang.leetcode;

public class test {
    public static void main(String[] args) {

        System.out.println();
    }
}



class MyMatrix {
    private double[][] data;
    private int rows;
    private int cols;

    // 构造方法
    public MyMatrix(double[][] a) {
        this.data = a;
        this.rows = a.length;
        this.cols = a[0].length;
    }

    // 矩阵加法
    public MyMatrix plus(MyMatrix B) {
        if (this.rows != B.rows || this.cols != B.cols) {
            throw new IllegalArgumentException("矩阵维度不匹配");
        }
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = this.data[i][j] + B.data[i][j];
            }
        }
        return new MyMatrix(result);
    }

    // 矩阵乘法
    public MyMatrix times(MyMatrix B) {
        if (this.cols != B.rows) {
            throw new IllegalArgumentException("矩阵维度不匹配");
        }
        double[][] result = new double[this.rows][B.cols];
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < B.cols; j++) {
                for (int k = 0; k < this.cols; k++) {
                    result[i][j] += this.data[i][k] * B.data[k][j];
                }
            }
        }
        return new MyMatrix(result);
    }

    // 矩阵转置
    public MyMatrix transpose() {
        double[][] result = new double[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = this.data[i][j];
            }
        }
        return new MyMatrix(result);
    }

    // 打印矩阵
    public void print(int w, int d) {
        System.out.println();
        for (double[] row : data) {
            for (double value : row) {
                System.out.printf("%" + w + "." + d + "f ", value);
            }
            System.out.println();
        }
        System.out.println();
    }
}

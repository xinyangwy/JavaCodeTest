package com.xinyang.leetcode;



import java.util.ArrayList;
import java.util.Collections;

public class zhenti {

    public static int minLights(int roadLength, int radius, int numLights, ArrayList<Integer> lightPositions) {
        // 首先对路灯位置进行排序
        Collections.sort(lightPositions);

        int currentPosition = 0; // 当前需要照亮的位置
        int lightCount = 0; // 已使用的路灯数量
        int index = 0; // 路灯位置数组的索引

        while (currentPosition < roadLength) {
            int farthestLight = -1;
            // 找到能照亮当前位置的最远路灯
            while (index < numLights && lightPositions.get(index) - radius <= currentPosition) {
                farthestLight = index;
                index++;
            }

            // 如果没有找到能照亮当前位置的路灯，返回 -1
            if (farthestLight == -1) {
                return -1;
            }

            // 更新当前位置为最远路灯能照亮的最远距离
            currentPosition = lightPositions.get(farthestLight) + radius;
            lightCount++;
        }

        return lightCount;
    }

    public static void main(String[] args) {
        int roadLength = 10;
        int radius = 2;
        int numLights = 3;
        ArrayList<Integer> lightPositions = new ArrayList<>();
        lightPositions.add(0);
        lightPositions.add(5);
        lightPositions.add(9);

        int result = minLights(roadLength, radius, numLights, lightPositions);
        System.out.println("照亮整段路最少需要的路灯数: " + result);
    }
}
package com.xinyang.leetcode;

public class test605 {
}


class Solution605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int cnt = 0;
        if (n == 0)
            return true;
        if (len == 1){
            if(n==1)return flowerbed[0]==0;
        }
        if (len >= 2) {
            if (flowerbed[0] == 0 && flowerbed[1] == 0) {
                flowerbed[0] = 1;
                cnt++;
            }
            if (flowerbed[len - 1] == 0 && flowerbed[len - 2] == 0) {
                flowerbed[len - 1] = 1;
                cnt++;
            }
            for (int i = 1; i < len - 1; i++) {
                if (flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    cnt++;
                }
            }
        }

        return cnt >= n;
    }
}
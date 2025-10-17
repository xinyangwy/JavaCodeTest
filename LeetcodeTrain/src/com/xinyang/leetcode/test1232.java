package com.xinyang.leetcode;

public class test1232 {
}


class Solution1232 {
    public boolean checkStraightLine(int[][] coordinates) {
        int deltaY=coordinates[1][1]-coordinates[0][1];
        int deltaX=coordinates[1][0]-coordinates[0][0];
        for(int i=1;i<coordinates.length;i++){
            if((coordinates[i][1]-coordinates[0][1])*deltaX != (coordinates[i][0]-coordinates[0][0])*deltaY){
                return false;
            }
        }
        return true;
    }
}
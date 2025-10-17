package com.xinyang.leetcode;

public class test1041 {
}


class Solution1041 {
    public boolean isRobotBounded(String instructions) {
        int [][]pos=new int[][]{{0,1},{-1,0},{0,-1},{1,0}};
        int indexPos=0;
        int []cur=new int[]{0,0};
        for(char c:instructions.toCharArray()){
            switch (c){
                case 'L':
                    indexPos=(indexPos+1)%4;
                case 'R':
                    indexPos=(indexPos-1+4)%4;
                default:
                    cur[0]+=pos[indexPos][0];
                    cur[1]+=pos[indexPos][1];
            }
        }
        return (cur[0]==0 && cur[0]==0)||(indexPos!=0);
    }
}
package com.xinyang.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test56 {
    public static void main(String[] args) {
        Solution56 s=new Solution56();
        int [][]res=s.merge(new int[][]{{1,3},{2,6},{8,10},{15,18}});
        for(int []num:res){
            for(int i:num){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

class Solution56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,((o1, o2) -> o1[0]-o2[0]));
        //按照左端点排序 需要合并的时候就是取最大的右端点
        List<int []> res=new ArrayList<>();
        for(int num[]:intervals){
            if(res.size()!=0 && num[0]<=res.get(res.size()-1)[1]){//第0个区间不算， 如果后一个区间和前一个区间重叠
                res.get(res.size()-1)[1]=Math.max(res.get(res.size()-1)[1],num[1]);//更新上一个区间的右端点最大值
            }else{//不相交  不能合并
                res.add(num);
            }
        }
        return res.toArray(new int[res.size()][2]);
    }
}
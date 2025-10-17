package com.xinyang.leetcode;

import java.util.*;

public class test763 {
    public static void main(String[] args) {
        Solution763 s=new Solution763();
        List<Integer> res =s.partitionLabels("eaaaabaaec");
        for(int num:res){
            System.out.println(num+" ");
        }
    }
}


//class Solution {
//    public List<Integer> partitionLabels(String s) {
//        List<Integer> res = new ArrayList<>();
//        char[] ch = s.toCharArray();
//        int end = 0;
//        for (int i = 0; i < s.length(); i++) {
//            end=s.lastIndexOf(ch[i]);
//            if (i != s.length() - 1) {
//                for (int j = i +           1; j <= end - 1; j++) {//注意这里更新的时候选用end
//                    end = Math.max(end, s.lastIndexOf(ch[j]));
//                }
//            }
//            res.add(end - i + 1);
//            i = end;
//        }
//        return res;
//    }
//}


class Solution763 {
    public List<Integer> partitionLabels(String s) {
        List<Integer> res=new ArrayList<>();
        char []ch=s.toCharArray();
        int start=0,end=0;
        for(int i=0;i<s.length();i++){
            end=Math.max(end,s.lastIndexOf(ch[i]));
            if(end==i){
                res.add(end-start+1);
                start=i+1;
            }
        }
        return res;
    }
}
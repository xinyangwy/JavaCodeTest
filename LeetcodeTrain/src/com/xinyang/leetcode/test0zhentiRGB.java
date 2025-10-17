package com.xinyang.leetcode;

import java.time.temporal.JulianFields;
import java.util.*;

//public class test0zhentiRGB {
//    public static void main(String[] args) {-
//
//        Scanner sc=new Scanner(System.in);
//        String str=sc.nextLine();
//        char []s=str.toCharArray();
//        Map<Character, List<Integer>> map=new HashMap<>();
//        int sum=0;
//        while (sum< s.length){
//            int cnt=1,max=0;
//            List<Integer> list=new ArrayList<>();//收集连续序号 list存储的是下标
//            for(int i=0;i<s.length-1;i++){
//                if(s[i]==0)continue;
//                if(s[i]==s[i+1]){
//                    cnt++;//记录最长子串的长度
//                    list.add(i);
//                }else{
//                    list.add(i);
//                    max=Math.max(max,cnt);
//                    if(map.getOrDefault(s[i],new ArrayList<>()).size()<max){
//                        List<Integer> val=list;
//                        map.put(s[i],val);//更新
//                    }
//
//                    cnt=1;
//                    list.clear();
//                }
//            }
//            //输出
//            for (Character c : map.keySet()) {
//                if(map.get(c).size()==max){
//                    System.out.println(c);
//                    for (Integer i : map.get(c)) {
//                        System.out.println(" "+(i+1));
//                        //标记已经遍历的  统计已经输出的数量
//                        s[i]=0;
//                        sum++;
//                    }
//                }
//            }
//        }
//    }
//}
//

package com.xinyang.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test438 {
    public static void main(String[] args) {
        Solution438 s=new Solution438();
        System.out.println(s.findAnagrams("cbaebabacd","abc"));;
    }
}

//
//class Solution {
//    public List<Integer> findAnagrams(String s, String p) {
//        int delta = p.length();
//        char[] ch = p.toCharArray();
//        // 对字符数组 ch 进行排序，将字符按字典序排列
//        Arrays.sort(ch);
//        List<Integer> res = new ArrayList<>();
//        int n = s.length();
//        // 遍历字符串 s，从索引 0 开始，直到索引 n - delta，确保截取的子字符串长度与 p 相同
//        for (int i = 0; i <= n - delta; i++) {
//            String tmp = s.substring(i, i + delta);
//            char[] ch2 = tmp.toCharArray();
//            // 对字符数组 ch2 进行排序，将字符按字典序排列
//            Arrays.sort(ch2);
//            if (Arrays.equals(ch, ch2)) {
//                res.add(i);
//            }
//        }
//        return res;
//    }
//}

class Solution438 {
    public List<Integer> findAnagrams(String s, String p) {
        char []ch1=new char[26];
        char []ch2=new char[26];
        List<Integer> res=new ArrayList<>();
        for(char c:p.toCharArray()){
            ch1[c-'a']++;
        }
        for(int i=0;i<s.length();i++){
            ch2[s.charAt(i)-'a']++;
            if(i<p.length()-1){
                continue;
            }
            if (Arrays.equals(ch1, ch2)) {
                res.add(i);
            }
            ch2[i-p.length()+1]=0;
        }
        return res;
    }
}
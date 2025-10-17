package com.xinyang.leetcode;

import java.util.ArrayList;
import java.util.List;

public class test17 {

}


class Solution17 {
    String []MAPPING={"",//0
    "",//1
    "adc",//2
    "def",//3
    "ghi",//4
    "jkl",//5
    "mno",//6
    "pqrs",//7
    "tuv",//8
    "wxyz",//9
    };

    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        StringBuffer temp=new StringBuffer();
        dfs(res,temp,digits,0);
        return res;
    }

    void dfs(List<String> res,StringBuffer temp,String digits,int num){
        if(temp.length()==digits.length()){
            res.add(temp.toString());
            return;
        }
        String str=MAPPING[digits.charAt(num)-'0'];
        for(int i=0;i<str.length();i++){
            temp.append(str.charAt(i));
            dfs(res,temp,digits,num+1);
            temp.deleteCharAt(temp.length()-1);
        }
    }

}
package com.xinyang.leetcode;

import java.util.*;

public class test131 {
}


class Solution31 {
    List<List<String>> res=new ArrayList<>();
    public List<List<String>> partition(String s) {
        List<String> path =new ArrayList<>();
        dfs(path,s,0);
        return res;
    }
    public void dfs(List<String> path,String s,int startindex){
        if(startindex>=s.length()){//已经划分到最后一个字母
            res.add(path);
            return;
        }
        for (int i=startindex;i<s.length();i++){
            String sub=s.substring(startindex,i+1);
            if(isHuiwen(sub)){
                path.add(sub);
                dfs(path,s,i+1);
                path.remove(path.size()-1);
            }
        }
    }
    public boolean isHuiwen(String sub){
        int len =sub.length();
        for(int i=0;i<len/2;i++){
            if(sub.charAt(i)!=sub.charAt(len-1-i)){
                return false;
            }
        }
        return true;
    }
}
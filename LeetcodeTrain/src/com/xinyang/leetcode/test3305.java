package com.xinyang.leetcode;

import java.util.Arrays;

public class test3305 {
}

class Solution3305 {
    String str="aeiou";
    public int countOfSubstrings(String word, int k) {
        int n=word.length(),res=0;
        for(int r=0;r<n;r++){
            for(int l=0;l<=r;l++){
                String tmp=word.substring(l,r+1);
                if(Yes(tmp,k)){
                    res++;
                }
            }
        }
        return res;
    }
    private boolean Yes(String word, int k){
        char []ch =word.toCharArray();
        char []abc=new char[26];
        int cntyuan=0,cnt=0;
        for(int i=0;i<word.length();i++){
            if(str.indexOf(ch[i]) != -1){
                abc[ch[i]-'a']++;
            }else{
                cnt++;
            }
        }
        char []empty=new char[26];
        if(cnt==k && abc['a'-'a']==0 &&abc['e'-'a']==0 &&abc['i'-'a']==0 &&abc['o'-'a']==0 &&abc['u'-'a']==0 ){
            return true;
        }
        return false;
    }

}
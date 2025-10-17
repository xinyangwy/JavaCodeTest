package com.xinyang.leetcode;

public class test125 {
}

class Solution125 {
    public boolean isPalindrome(String s) {
        StringBuilder res=new StringBuilder();
        char []ch=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(ch[i]>='A' && ch[i]<='Z'){
                res.append((char)(ch[i]+32));
            }
            if((ch[i]>='a' && ch[i]<='z')||(ch[i]>='0' && ch[i]<='9')){
                res.append(ch[i]);
            }
        }
        return res.toString().equals(res.reverse().toString());
    }
}
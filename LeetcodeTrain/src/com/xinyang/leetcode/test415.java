package com.xinyang.leetcode;

public class test415 {
    public static void main(String[] args) {
        Solution415 s=new Solution415();
        System.out.println(s.addStrings("123","11"));
    }
}



class Solution415 {
    public String addStrings(String num1, String num2) {
        StringBuilder res=new StringBuilder();
        int i= num1.length()-1,j=num2.length()-1,more=0;
        while(i>=0  || j>=0){
            int x=i>=0 ? num1.charAt(i)-'0':0;
            int y=j>=0 ? num2.charAt(j)-'0':0;
            int sum=x+y+more;
            res.append(sum%10);
            more=sum/10;
        }
        if(more!=0){
            res.append((char)(more+'0'));
        }
        return res.reverse().toString();
    }
}
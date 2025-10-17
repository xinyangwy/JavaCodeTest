package com.xinyang.leetcode;

public class test67 {
    public static void main(String[] args) {
        Solution67 s=new Solution67();
        System.out.println(s.addBinary("11","1"));
    }
}


class Solution67 {
    public String addBinary(String a, String b) {
        StringBuilder res=new StringBuilder();
        int indexa=a.length()-1,indexb=b.length()-1;
        int more=0;
        while(indexa>=0 || indexb>=0){
            int numa=indexa>=0?a.charAt(indexa)-'0':0;
            int numb=indexb>=0?b.charAt(indexb)-'0':0;
            res.append((numa+numb+more)%2);
            more=(numa+numb+more)/2;
            indexa--;
            indexb--;
        }
        if(more!=0)res.append(more);
        return res.reverse().toString();
    }
}
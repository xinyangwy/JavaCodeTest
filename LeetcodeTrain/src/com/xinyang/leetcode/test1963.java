package com.xinyang.leetcode;

public class test1963 {
}


class Solution1963 {
    public int minSwaps(String s) {
        //从左想有遍历
        //c为正代表左边左括号多 不会出现问题
        //遇到左括号就++ 遇到右括号就-- ，如果  遇上右括号而且c等于=0代表之后就为-1  需要换
        char ch[]=s.toCharArray();
        int cnt=0,c=0,j=ch.length;
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='['){
                c++;
            }else if(ch[i]==']' && c>0){
                c--;
            }else if(ch[i]==']' && c==0){
                //找到最右边的左括号 交换

                while(j==']'){
                    j--;
                }
                //找到了左括号 交换
                ch[j]=']';
                ch[i]='[';
                cnt++;
            }
        }
        return cnt;
    }
}

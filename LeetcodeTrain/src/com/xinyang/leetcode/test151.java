package com.xinyang.leetcode;

public class test151 {
    public static void main(String[] args) {
        Solution151 solution = new Solution151();
        System.out.println(solution.reverseWords("  hello world  "));;
    }
}

class Solution151 {
    public String reverseWords(String s) {
        StringBuffer res = new StringBuffer();
        int  i=0;
        int j=s.length()-1;
        while(i<j && s.charAt(i)==' '){i++;}
        while(i<j && s.charAt(j)==' '){j--;}
        while(i<j){
            int k=j;
            while(j>i && s.charAt(i)!=' '){j--;}
            res.append(s.substring(j+1,k));
            while(i<j && s.charAt(j)==' '){j--;}
        }
        return res.toString();










//        String[] words = s.split(" ");
//        String res = "";
//        for (int i = words.length - 1; i >= 0; i--) {
//             System.out.print(words[i]+" ");
//             System.out.println();
//            if (!words[i].equals(" ") && !words[i].equals("")) {
//                res += words[i];
//            }
//        }
//        if(res.charAt(s.length()-1)==' '){
//            res = res.substring(0, s.length()-1);
//        }
//        return res;
    }
}

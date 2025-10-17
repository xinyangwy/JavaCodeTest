package com.xinyang.leetcode;

public class testQ3 {
    public static void main(String[] args) {
        SolutionQ3 s=new SolutionQ3();
        System.out.println(s.maxSubstringLength("gyye",3));
    }
}

class SolutionQ3 {
    public boolean maxSubstringLength(String s, int k) {
        int n=s.length();
        char []ch =s.toCharArray();
        for(int i=0;i<=n-k;i++){
            String tmp=s.substring(i,i+k);
            if(isDifferent(tmp)){
                int j;
                for(j=i;j<i+k;j++){
                    if(s.indexOf(ch[j])>=i && s.lastIndexOf(ch[j])<i+k){
                        continue;
                    }else{
                        break;
                    }
                }
                if(j==i+k){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean isDifferent(String s){
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                return false;
            }
        }
        return true;
    }
}

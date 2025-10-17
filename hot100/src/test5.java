public class test5 {
}


class Solution005 {
    public String longestPalindrome(String s) {
        int len=s.length();
        if(len<2){
            return s;
        }
        int maxlen=1,begin=0;
        char ch[]=s.toCharArray();
        boolean dp[][]=new boolean[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i]=true;
        }
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++) {
                if(ch[i]!=ch[j]){
                    dp[i][j]=false;
                }else{
                    if(i+1==j)dp[i][j]=true;
                    else{
                        dp[i][j]=dp[i+1][j-1];
                    }
                }

                if(dp[i][j] && j-i+1>maxlen){
                    maxlen=j-i+1;
                    begin=i;
                }
            }
        }
        return s.substring(begin,begin+maxlen);
    }
}
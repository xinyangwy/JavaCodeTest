package com.xinyang.leetcode;

public class test518 {
}


//class Solution518 {
//    public int change(int amount, int[] coins) {
//        int dp[]=new int[amount+1];
//        int n=coins.length;
//        dp[0]=1;//dp[0] 应该初始化为 1，因为凑成金额为 0 的组合只有一种，即不使用任何硬币
//        for(int i=0;i<n;i++){
//            for(int j=coins[i];j<=amount;j++){
//                dp[j]=dp[j]+dp[j-coins[i]];
//                //dp[j] 应该等于 dp[j] + dp[j - coins[i]]，而不是 dp[j] + dp[j - coins[i]] + coins[i]。
//                // 因为我们要计算的是组合数，而不是金额的总和。
//            }
//        }
//        return dp[amount];
//    }
//}



class Solution518 {
    public int change(int amount, int[] coins) {

        int n=coins.length;
        int dp[][]=new int[n][amount+1];
        for(int j=0;j<=amount;j++){
            dp[0][j]+=dp[0][j-coins[0]];
        }
        for(int i=0;i<n;i++){
            dp[i][0]=1;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=amount;j++){
                if(j<coins[i])dp[i][j]=dp[i-1][j];
                dp[i][j]=dp[i-1][j]+dp[i][j-coins[i]];
            }
        }
        return dp[n-1][amount];
    }
}


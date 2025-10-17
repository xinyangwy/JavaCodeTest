public class test53 {
}


class Solution53 {
    public int maxSubArray(int[] nums) {
        int dp[]=new int[nums.length];
        dp[0]=nums[0];
        int res=Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if(dp[i-1]>0){
                dp[i]=dp[i-1]+nums[i];
            }else{
                dp[i]=nums[i];
            }
            res=Math.max(res,dp[i]);
        }
        return res;
    }
}
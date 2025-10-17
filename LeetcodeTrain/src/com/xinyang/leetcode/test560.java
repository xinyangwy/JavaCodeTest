package com.xinyang.leetcode;

import java.util.HashMap;
import java.util.Map;

public class test560 {
}


class Solution560 {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int sum[]=new int[n+1];//前i个元素的元素和
        for(int i=0;i<n;i++){
            sum[i+1]=sum[i]+nums[i];
        }
        Map<Integer,Integer> cnt =new HashMap<>();
        int ans=0;
        for(int r=1;r<=n;r++){
            ans+=cnt.getOrDefault(sum[r]-k,0);
            cnt.merge(sum[r],1,Integer::sum);
            // if(sum[r]-sum[l]==k){
            //     cnt++;
            // }
        }
        return ans;
    }
}


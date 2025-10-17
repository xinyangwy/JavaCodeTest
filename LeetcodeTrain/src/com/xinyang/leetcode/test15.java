package com.xinyang.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test15 {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        System.out.println(arr.length);//无括号
        String arrStr=Arrays.toString(arr);
        System.out.println(arrStr);
        System.out.println(arrStr.length());//有括号
        for(int i=0;i<arrStr.length();i++){
            System.out.print(arrStr.charAt(i)+" ");
        }
//        Solution15 solution15 = new Solution15();
//        solution15.threeSum()
    }
}
class Solution15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        int len = nums.length;
        if(nums == null || len < 3) return ans;
        Arrays.sort(nums); // 排序，nums变成递增数组
        for (int i = 0; i < len ; i++) {// i < nums.length - 2是为了保证后面还能存在两个数字
            if(nums[i] > 0) break; // 如果当前数字大于0，则三数之和一定大于0，所以结束循环
            if(i > 0 && nums[i] == nums[i-1]) continue; // 去重  针对i指针（第一个数）  1112356
            int L = i+1;
            int R = len-1;
            while(L < R){
                int sum = nums[i] + nums[L] + nums[R];
                if(sum == 0){
                    ans.add(Arrays.asList(nums[i],nums[L],nums[R]));
                    while (L<R && nums[L] == nums[L+1]) L++; // 去重   针对L指针（第二个数）1222356
                    while (L<R && nums[R] == nums[R-1]) R--; // 去重   针对R指针（第三个数）1235666
                    L++;
                    R--;
                }
                else if (sum < 0) L++;
                else if (sum > 0) R--;
            }
        }
        return ans;
    }
}


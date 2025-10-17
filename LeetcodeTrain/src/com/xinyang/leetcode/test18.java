package com.xinyang.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class test18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);
    }
}


class Solution18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return res;
        }
        for (int i = 0; i < nums.length - 3; i++) {
            if (nums[i] > target && nums[i + 1] >= 0) {
                break;
            } // 剪枝
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            } // 去重
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (nums[i] + nums[j] > target && nums[j + 1] >= 0) {
                    break;
                } // 剪枝
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                } // 去重
                int L = j + 1;
                int R = nums.length - 1;
                while (L < R) {//注意这里不要忘记
                    int sum = nums[i] + nums[j] + nums[L] + nums[R];
                    if (sum == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[L], nums[R]));
                        while (L < R && nums[L] == nums[L + 1])
                            L++;
                        while (L < R && nums[R] == nums[R - 1])
                            R--;
                        L++;
                        R--;
                    } else if (sum < target)
                        L++;
                    else if (sum > target)
                        R--;
                }
            }
        }
        return res;
    }
}
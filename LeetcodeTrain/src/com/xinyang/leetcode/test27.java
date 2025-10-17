package com.xinyang.leetcode;

public class test27 {
    public int removeElement(int[] nums, int val) {
        // 快慢指针
        int slowIndex = 0;
        //基本思想：slowIndex  : 已经删除val元素的新数组的下标的位置
        //fastIndex : 寻找新数组的元素 ，新数组就是不含有目标元素的数组
        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != val) {//如果原数组中的元素不等于val，那么就是属于新数组的元素
                //复制到新数组中的对应的位置
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;
    }
//    public int removeElement(int[] nums, int val) {
//        int n=nums.length;
//        for(int i = 0; i < n; i++){
//            if(nums[i] == val){
//                for(int j = i+1; j < n; j++){
//                    nums[j-1] = nums[j];
//                }
//                i--;
//                n--;
//            }
//        }
//        return n;
//    }
}

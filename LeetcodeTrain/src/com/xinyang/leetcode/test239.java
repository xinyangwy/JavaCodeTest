package com.xinyang.leetcode;

import java.util.ArrayDeque;
//import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class test239 {
    public static void main(String[] args) {
        Solution239 s = new Solution239();
        s.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);
    }

}



//利用双端队列手动实现单调队列
/**
 * 用一个单调队列来存储对应的下标，每当窗口滑动的时候，直接取队列的头部指针对应的值放入结果集即可
 ArrayDeque里面存储的是数组下标
 * 单调队列类似 （tail -->） 3 --> 2 --> 1 --> 0 (--> head) (右边为头结点，元素存的是下标)
 */
class Solution239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer> deque =new ArrayDeque<>();
        int n=nums.length;
        int []res=new int[n-k+1];
        int cnt=0;
        for(int i = 0; i < n; i++) {
            if(!deque.isEmpty() && deque.peek()<i-k+1) {
                deque.poll();
            } else if (!deque.isEmpty() && nums[deque.peekLast()]<nums[i]) {
                deque.pollLast();
            }
            deque.addLast(nums[i]);
            if(i>=k-1) {
                res[cnt++]=deque.peek();
            }
        }
        return res;
    }
}
package com.xinyang.leetcode;

public class test0207 {
    public static void main(String[] args) {

    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
class Solution0207 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null){
            return null;
        }
        int lengthA = 0,lengthB = 0;
        ListNode curA = headA,curB = headB;
        while (curA != null) {
            lengthA++;
            curA = curA.next;
        }
        while (curB != null) {
            lengthB++;
            curB = curB.next;
        }
        curA = headA;
        curB = headB;
        int len = Math.abs(lengthA - lengthB);
        while (lengthA>lengthB && len!=0) {
            curA=curA.next;
            len--;
        }
        while (lengthB>lengthA && len!=0) {
            curB=curB.next;
            len--;
        }
        while (curA!=null && curB!=null) {
            curA=curA.next;
            curB=curB.next;
            if(curA==curB) {
                return curA;
            }
        }
        return null;
    }
}
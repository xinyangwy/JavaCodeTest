package com.xinyang.leetcode;

public interface test203 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode();
//        Solution203 s = new Solution203();
//        s.removeElements();
    }
}


/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution203 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;

        ListNode headTmp = new ListNode();
        headTmp.next = head;

        ListNode pre = headTmp;
        ListNode p = headTmp.next;
        while (p != null) {
            if (p.val == val) {
                pre.next = p.next;
                p = p.next;
            } else {
                pre = p;
                p = p.next;
            }
        }
        return headTmp.next;
    }
}


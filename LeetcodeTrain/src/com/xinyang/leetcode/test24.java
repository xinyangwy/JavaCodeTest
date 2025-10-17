package com.xinyang.leetcode;

public class test24 {
    public static void main(String[] args) {
        Solution24 solution24 = new Solution24();

    }
}


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution24 {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode Vhead = new ListNode(0);
        ListNode in = Vhead;
        ListNode pre = in.next;
        ListNode p = pre.next;
        while(pre != null) {
            pre.next = p.next;
            p.next = pre;
            in.next = p;

            in=pre;
            pre = in.next;
            p= pre.next;
        }
        return Vhead.next;
    }
}
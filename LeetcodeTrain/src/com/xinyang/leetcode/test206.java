package com.xinyang.leetcode;

public class test206 {
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
class Solution206 {
    public ListNode reverseList(ListNode head) {
        ListNode newHead = new ListNode();
        newHead.next=null;
        ListNode p=head;
        while(p!=null){
            ListNode tmp=p.next;
            p.next=newHead.next;
            newHead.next=p;
            p=tmp;
        }
        return newHead.next;
    }
}


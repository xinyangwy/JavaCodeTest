package com.xinyang.leetcode;

public class test83 {
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
class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode pre=head;
        ListNode p=head.next;
        while(p!=null){
            if(pre.val==p.val){
                pre.next=p.next;
                p=p.next;
            }else{
                pre=pre.next;
                p=p.next;
            }
        }
        return head;
    }
}

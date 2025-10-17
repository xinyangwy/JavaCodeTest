package com.xinyang.leetcode;

public class test21 {
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
class Solution21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead=new ListNode();
        ListNode p=dummyHead;
        while(list1!=null && list2!=null){
            p.next=list1.val<list2.val?list1:list2;
            p=p.next;
            list1=list1.next;
            list2=list2.next;
        }
        if(list1==null)p=list2;
        if(list2==null)p=list1;
        return dummyHead.next;
    }
}
package com.xinyang.leetcode;

import java.util.ArrayList;
import java.util.List;

public class test148 {
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
class Solution148 {
    public ListNode sortList(ListNode head) {
        if(head==null)return head;
        List<Integer> nums=new ArrayList<>();
        ListNode cur=head;
        while(cur!=null){
            nums.add(cur.val);
            cur=cur.next;
        }
        nums.sort((o1,o2)->o1-o2);
        cur=head;
        int i=0;
        while(cur!=null){
            cur.val= nums.get(i++);
        }
        return head;
    }
}
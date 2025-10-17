package com.xinyang.leetcode;

public class test160 {
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
class Solution60 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null){
            return null;
        }
        ListNode pa=headA;
        ListNode pb=headB;
        int lena=0,lenb=0;
        while(pa!=null){
            lena++;
            pa=pa.next;
        }
        while(pb!=null){
            lenb++;
            pb=pb.next;
        }
        //先走几步
        int delta=Math.abs(lena-lenb);
        pa=headA;
        pb=headB;
        if(lenb>lena){
            while(delta!=0){
                pb=pb.next;
                delta--;
            }
        }else{
            while(delta!=0){
                pa=pa.next;
                delta--;
            }
        }

        while(pa!=null && pb!=null){
            if(pa==pb){
                return pa;
            }
            pa=pa.next;
            pb=pb.next;

        }
        return null;
    }
}
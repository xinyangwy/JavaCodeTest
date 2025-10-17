package com.xinyang.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test445 {
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
class Solution445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> num1=new ArrayList<>();
        List<Integer> num2=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        while(l1!=null){
            num1.add(l1.val);
            l1=l1.next;
        }
        while(l2!=null){
            num2.add(l2.val);
            l2=l2.next;
        }
        int i=num1.size()-1,j=num2.size()-1,carry=0;
        while(i>=0||j>=0){
            int x=i>=0?num1.get(i):0;
            int y=j>=0?num2.get(j):0;
            int tmp=x+y+carry;
            res.add(tmp%10);
            carry=tmp/10;
            i--;
            j--;
        }
        if(carry!=0)res.add(carry);
        ListNode dummyHead = new ListNode();
        ListNode current = dummyHead;
        for (int k = res.size() - 1; k >= 0; k--) {
            current.next = new ListNode(res.get(k));
            current = current.next;
        }
        return dummyHead.next;
    }
}
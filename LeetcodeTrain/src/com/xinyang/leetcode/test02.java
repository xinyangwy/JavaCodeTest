package com.xinyang.leetcode;

public class test02 {
    public static void main(String[] args) {
        ListNode l1=new ListNode(2);
        l1.next=new ListNode(4);
        l1.next.next=new ListNode(3);
        l1.next.next.next=null;

        ListNode l2=new ListNode(5);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(4);
        l2.next.next.next=null;

        Solution02 s=new Solution02();
        s.addTwoNumbers(l1,l2);
    }
}

class Solution02 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead=new ListNode(0);
        ListNode cur=dummyHead;
        int carry=0;
        while (l1 != null || l2 != null) {
            int sum=(l1==null?0:l1.val)+(l2==null?0:l2.val)+carry;
            cur.next=new ListNode(sum%10);;
            carry=sum/10;
            while(l1!=null)l1=l1.next;
            while(l2!=null)l2=l2.next;
        }
        return dummyHead.next;
    }
}
//https://leetcode.cn/problems/add-two-numbers/solutions/2826226/jiang-lian-biao-fan-guo-lai-kan-jiu-bu-b-mfhh/



//class Solution02 {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        int len1=0,len2=0;
//        ListNode p1=l1,p2=l2;
//        while(p1!=null){
//            len1++;
//            p1=p1.next;
//        }
//        while(p2!=null){
//            len2++;
//            p2=p2.next;
//        }
//        p1=l1;
//        p2=l2;
//        char []nums1=new char[len1];
//        char []nums2=new char[len2];
//        for(int i=len1-1;i>=0;i--){
//            nums1[i]= (char) ('0'+ p1.val);
//            p1=p1.next;
//        }
//        for(int i=len2-1;i>=0;i--){
//            nums2[i]=(char) ('0'+ p2.val);
//            p2=p2.next;
//        }
//        String num1Str=new String(nums1);
//        String num2Str=new String(nums2);
//        int num1=Integer.parseInt(num1Str);
//        int num2=Integer.parseInt(num2Str);
//        int sum=num1+num2;
//        ListNode head=new ListNode();
//        head.next=null;
//        ListNode cur=head;
//        while(sum!=0){
//            int tmp=sum%10;
//            sum=sum/10;
//            cur.val=tmp;
//            cur.next=new ListNode();
//            cur=cur.next;
//        }
//        cur=null;
//        return head;
//    }
//}

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
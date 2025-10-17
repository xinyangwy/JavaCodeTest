package com.xinyang.leetcode;

class MyLinkedList {
    int size;
    ListNode head;
    public MyLinkedList() {
        size=0;
        head=null;
    }

    public int get(int index) {
        if(index<0 || index>=size){
            return -1;
        }
        ListNode cur=head;
        for(int i=0;i<index;i++){
            cur=cur.next;
        }
        return cur.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if(index<0 || index>=size) {
            return;
        }
        ListNode cur=head;
        for(int i=0;i<index;i++){
            cur=cur.next;
        }
        ListNode newNode=new ListNode(val);
        newNode.next=cur.next;
        cur.next=newNode;
        size++;
    }

    public void deleteAtIndex(int index) {
        if(index<0 || index>=size) {
            return;
        }
        if(index==0){
            head=head.next;
        }
        ListNode cur=head;
        for(int i=0;i<index-1;i++){
            cur=cur.next;
        }
        cur=cur.next.next;
    }
}


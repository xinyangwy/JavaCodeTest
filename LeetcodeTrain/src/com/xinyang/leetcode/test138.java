package com.xinyang.leetcode;

import java.util.HashMap;
import java.util.Map;

public class test138 {
}


/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
//
//class Solution138 {
//    public Node copyRandomList(Node head) {
//        if(head==null)return null;
//        Node cur=head;
//        Map<Node,Node> map=new HashMap<>();
//        while(cur!=null){
//            map.put(cur,new Node(cur.val));
//            cur=cur.next;
//        }
//        cur=head;
//        while(cur!=null){
//            map.get(cur).next = map.get(cur.next);
//            map.get(cur).random = map.get(cur.random);
//            cur = cur.next;
//        }
//        return map.get(head);
//    }
//}
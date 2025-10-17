package com.xinyang.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class test429 {
}


/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

//class Solution429 {
//    public List<List<Integer>> levelOrder(Node root) {
//        Queue<Node> q=new LinkedList<>();
//        List<List<Integer>> res=new ArrayList<>();
//        if(root!=null)q.offer(root);
//        while (!q.isEmpty()){
//            List<Integer> tmp=new ArrayList<>();
//            for(int i=q.size();i>0;i--){
//                Node node=q.poll();
//                for(Node child:node.children){
//                    tmp.add(child.val);
//                }
//            }
//            res.add(tmp);
//        }
//        return res;
//    }
//}

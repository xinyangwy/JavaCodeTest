package com.xinyang.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class test046 {
    public static void main(String[] args) {
        Solution046 s=new Solution046();
//        s.rightSideView();
        System.out.println();
    }
}


class Solution046 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null){
            return res;
        }
        q.add(root);
        while (!q.isEmpty()){
            for(int i=q.size();i>=0;i--){
                TreeNode cur=q.poll();
                if(i==0){
                    res.add(cur.val);
                }
                if(cur.left!=null){
                    q.add(cur.left);
                }
                if(cur.right!=null){
                    q.add(cur.right);
                }
            }
        }
        return res;
    }
}

package com.xinyang.leetcode;

public class test230 {
}


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution230 {
    int res=0,cnt=0;
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root,k);
        return res;
    }
    private void inOrder(TreeNode root,int k){
        if(root==null){
            return;
        }
        inOrder(root.left,k);
        cnt++;
        if(cnt==k){
            res=root.val;
        }
        inOrder(root.right,k);
    }
}
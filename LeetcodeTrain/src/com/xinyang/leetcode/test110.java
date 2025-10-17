package com.xinyang.leetcode;

public class test110 {
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
class Solution110 {
    public boolean isBalanced(TreeNode root) {
        if(Math.abs(height(root.left)-height(root.right))>1){
            return false;
        }
        if(root==null){
            return true;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int lefth=height(root.left);
        int right=height(root.right);
        return Math.max(lefth,right)+1;
    }
}
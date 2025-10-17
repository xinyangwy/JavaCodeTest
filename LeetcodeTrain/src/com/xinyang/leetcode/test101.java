package com.xinyang.leetcode;

public class test101 {
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
class Solution101 {
    public boolean isSymmetric(TreeNode root) {
        return compare(root.left,root.right);
    }
    public boolean compare(TreeNode left,TreeNode right) {
        if(left==null && right==null)return true;
        if((left==null &&right!=null)||(left!=null &&right==null))return false;
        if(left.val!=right.val) return false;
        return compare(left.left,right.right)&& compare(left.right,right.left);

    }
}
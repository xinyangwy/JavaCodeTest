package com.xinyang.leetcode;

public class test104 {
}


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution104 {
    public int maxDepth(TreeNode root) {
        return PreOrder(root, 0);
    }
    private int PreOrder(TreeNode root ,int depth){
        if(root==null){
            return 0;
        }
        return Math.max(PreOrder(root.left,depth),PreOrder(root.right,depth))+1;
    }
}
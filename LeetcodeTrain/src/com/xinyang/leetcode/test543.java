package com.xinyang.leetcode;

public class test543 {
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
class Solution543 {
    int maxLen=0;
    public int diameterOfBinaryTree(TreeNode root) {
        getMaxWidth(root);
        return maxLen;
    }
    private int getMaxWidth(TreeNode root){
        if(root==null){
            return 0;
        }
        int lefth=getMaxWidth(root.left);
        int righth=getMaxWidth(root.right);
        maxLen=Math.max(maxLen,lefth+righth);
        return Math.max(lefth,righth)+1;
    }
}


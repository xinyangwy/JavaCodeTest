package com.xinyang.leetcode;

public class test112 {
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
class Solution112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return preOrder(root,0,targetSum);
    }
    private boolean preOrder(TreeNode root,int curSum,int targetSum){
        if(root==null)return false;
        curSum+=root.val;
        if(root.left==null && root.right==null){
            return curSum==targetSum;
        }else{
            return preOrder(root.left,curSum,targetSum) || preOrder(root.right,curSum,targetSum);
        }
    }
}

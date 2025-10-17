package com.xinyang.leetcode;

public class test111 {
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
class Solution111 {
    public int minDepth(TreeNode root) {
        if(root==null)return 0;
        if(root.left==null&& root.right==null){
            return 1;
        }
//        if(root.left==null || root.right===null){
//            return minDepth(root.left)+minDepth(root.right)+1;//因为其中一个为0，相当于：不为0的加1
//        }
        return Math.min(minDepth(root.left),minDepth(root.left))+1;
    }
}
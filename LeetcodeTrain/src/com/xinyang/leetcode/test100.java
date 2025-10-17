package com.xinyang.leetcode;

public class test100 {
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
class Solution100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // 如果两个节点都为空，说明这部分子树相同
        if (p == null && q == null) {
            return true;
        }
        // 如果一个节点为空，另一个不为空，说明两棵树不同
        if (p == null || q == null) {
            return false;
        }
        // 如果当前节点的值不相等，说明两棵树不同
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}
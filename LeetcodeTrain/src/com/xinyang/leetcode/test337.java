package com.xinyang.leetcode;

public class test337 {
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
class Solution337 {
    public int rob(TreeNode root) {
        int []res=postOrder(root);
        return Math.max(res[0],res[1]);
    }

    private int []postOrder(TreeNode root){
        int []cur=new int[2];
        if(root==null){
            return cur;
        }
        int []left=postOrder(root.left);
        int []right=postOrder(root.right);

        cur[0]=Math.max(Math.max(left[0],left[1]),Math.max(right[0],right[1]));
        cur[1]= root.val+left[0]+right[0];
        return cur;
    }
}
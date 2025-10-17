package com.xinyang.leetcode;

public class test437 {
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
//class Solution437 {
//    int ans=0,t=0;
//    public int pathSum(TreeNode root, int targetSum) {
//        if(root==null )return 0;
//        t=targetSum;
//        dfs1(root);
//        return ans;
//    }
//    void dfs1(TreeNode root){
//        dfs2(root,root.val);
//        dfs1(root.left);
//        dfs1(root.right);
//    }
//
//    void dfs2(TreeNode root, int val){
//        if(val==t){
//            ans++;
//        }
//        if(root.left!=null)dfs2(root.left,val+root.left.val);
//        if(root.right!=null) dfs2(root.right,val+root.right.val));
//    }
//
//}
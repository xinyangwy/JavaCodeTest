package com.xinyang.leetcode;

import java.util.*;

public class test107 {
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
class Solution107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        Stack<List<Integer>> resTmp = new Stack<>();
        List<List<Integer>> res = new ArrayList<>();
        if (root != null) {
            q.offer(root);
        }
        while (!q.isEmpty()) {
            List<Integer> tmp = new ArrayList<>();
            for (int i = q.size(); i > 0; i--) {
                TreeNode t = q.poll();
                tmp.add(t.val);
                if (t.left != null)
                    q.offer(t.left);
                if (t.right != null)
                    q.offer(t.right);
            }
            resTmp.push(tmp);
        }
        while (!resTmp.empty()) {
            res.add(resTmp.pop());
        }
        return res;
    }
}
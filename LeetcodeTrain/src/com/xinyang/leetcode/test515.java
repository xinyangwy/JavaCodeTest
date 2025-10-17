package com.xinyang.leetcode;

import java.util.*;

public class test515 {
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
class Solution515 {
    public List<Integer> largestValues(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> res  = new ArrayList<>();
        q.offer(root);
        while (!q.isEmpty()) {//每层循环  就是  树的每层
            int max = Integer.MIN_VALUE;
            for (int i = q.size(); i > 0; i--) {//处理树的单层的元素
                TreeNode cur = q.poll();
                max= Math.max(max,cur.val);
                if(cur.left!=null)q.offer(cur.left);
                if(cur.right!=null)q.offer(cur.right);
            }
            res.add(max);//加入每层
        }
        return res;
    }
}

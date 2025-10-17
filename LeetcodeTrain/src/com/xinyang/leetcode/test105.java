package com.xinyang.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class test105 {

}


class Solution105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (inorder.length == 0 || preorder.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode();
        root.val = preorder[0];
        for (int i = 0; i < inorder.length; i++) {
            if (preorder[0] == inorder[i]) {
                int[] preorderL = Arrays.copyOfRange(preorder, 1, i + 1);
                int[] preorderR = Arrays.copyOfRange(preorder, i + 1, preorder.length);
                int[] inorderL = Arrays.copyOfRange(inorder, 0, i);
                int[] inorderR = Arrays.copyOfRange(inorder, i + 1, inorder.length);
                root.left = buildTree(preorderL, inorderL);
                root.right = buildTree(preorderR, inorderR);
                break;
            }
        }
        return root;
    }
}



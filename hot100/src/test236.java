public class test236 {
}


class Solution236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root==p || root==q) return root;
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right =lowestCommonAncestor(root.right,p,q);
        if(left==null && right!=null)return right;
        if(left!=null && right==null)return left;
        if(left==null && right==null)return null;
        return root;

    }
}
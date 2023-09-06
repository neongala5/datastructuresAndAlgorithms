package com.carlos.datastructuresandalgorithms.BinaryTrees;

class BalancedBinaryTree {
    boolean isBalanced = true;
    public boolean isBalanced(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)) return true;

        maxDepth(root);
        return isBalanced;
    }

    public int maxDepth(TreeNode root) {
        if(root == null) return 0;

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        if(Math.abs(leftDepth - rightDepth) > 1) isBalanced = false;

        return Math.max(leftDepth, rightDepth) + 1;
    }
}

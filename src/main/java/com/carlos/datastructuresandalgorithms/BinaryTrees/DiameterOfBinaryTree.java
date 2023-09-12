package com.carlos.datastructuresandalgorithms.BinaryTrees;

class DiameterOfBinaryTree {
    int maxDiameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return maxDiameter;
    }

    public int maxDepth(TreeNode root) {
        if(root == null) return 0;

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        int currentDiameter = leftDepth + rightDepth;
        maxDiameter = Math.max(maxDiameter, currentDiameter);

        return Math.max(leftDepth, rightDepth) +1;
    }
}

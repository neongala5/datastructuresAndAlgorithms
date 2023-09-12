package com.carlos.datastructuresandalgorithms.BinaryTrees;

class GoodNodesInBinaryTree {
    int goodCount = 0;
    public int goodNodes(TreeNode root) {
        dfs(root, Integer.MIN_VALUE);
        return goodCount;
    }

    public void dfs(TreeNode root, int maxSoFar) {
        if(root.val >= maxSoFar) goodCount++;
        if(root.left != null) dfs(root.left, Math.max(root.val, maxSoFar));
        if(root.right != null) dfs(root.right, Math.max(root.val, maxSoFar));
    }
}
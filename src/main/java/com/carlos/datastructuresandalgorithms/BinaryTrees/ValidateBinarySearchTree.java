package com.carlos.datastructuresandalgorithms.BinaryTrees;

class ValidateBinarySearchTree {
    // although this is the fastest way
    // its perhaps easier to remember the inorder traversal way (seen in your other submissions)
    // feel like this may be too clever to remember.
    // with inorder traversal you just have to remember that bst is sorted in inorder traversal
    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }

    public boolean validate(TreeNode root, Integer low, Integer high) {
        if (root == null) return true;

        if ((low != null && root.val <= low) || (high != null && root.val >= high)) return false;

        return validate(root.right, root.val, high) && validate(root.left, low, root.val);
    }
}
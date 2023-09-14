package com.carlos.datastructuresandalgorithms.BinaryTrees;

import java.util.Stack;
class KthSmallestElementInABst {
    // figured this one out all on my own in like 2 minutes. way to go me.
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();

        int count = 0;

        while(!stack.isEmpty() || root != null) {
            while(root != null) {
                stack.add(root);
                root = root.left;
            }

            root = stack.pop();

            count++;
            if(count == k) return root.val;
            root = root.right;

        }
        return count;
    }
}
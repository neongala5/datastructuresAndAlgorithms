package com.carlos.datastructuresandalgorithms.BinaryTrees;

import java.util.*;
class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            int size = queue.size();

            for(int i = 0; i < size; i++) {
                TreeNode currentNode = queue.remove();

                // looking for when i == 0 is easier to understand than when i == size -1
                // which is what would happen if you do a left to right BFS
                // (more details below)
                if(i == 0) result.add(currentNode.val);

                // You can switch the BFS traversal from right to left or left to right
                // By flipping these 2 lines around
                // in this case i went right to left so i can find the rightmost one first
                // Otherwise if you go left to right, youre gonna have to add
                // the node when i == size - 1 (which could be prone to human error)
                if(currentNode.right != null) queue.add(currentNode.right);
                if(currentNode.left != null) queue.add(currentNode.left);
            }
        }
        return result;
    }
}
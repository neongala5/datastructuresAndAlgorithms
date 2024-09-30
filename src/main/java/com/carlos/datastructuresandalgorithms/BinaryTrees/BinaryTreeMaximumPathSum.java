package com.carlos.datastructuresandalgorithms.BinaryTrees;

class BinaryTreeMaximumPathSum {
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {

        int total = pathSum(root);

        max = Math.max(max, total);

        return max;

    }

    public int pathSum(TreeNode root){
        if(root == null) return 0;

        int leftOnlySum = pathSum(root.left);
        int rightOnlySum = pathSum(root.right);
        int biggestOfTwo = Math.max(leftOnlySum, rightOnlySum);
        int bothSidesSum =  leftOnlySum + rightOnlySum;
        int biggest = Math.max(biggestOfTwo, bothSidesSum) + root.val;

        if(root.val > biggest) biggest = root.val;

        max = Math.max(max, biggest);

        // you cant return the sum of poth sides cause thats two different paths.
        // so only return one side, or just the root
        return Math.max(biggestOfTwo + root.val, root.val);

    }
}
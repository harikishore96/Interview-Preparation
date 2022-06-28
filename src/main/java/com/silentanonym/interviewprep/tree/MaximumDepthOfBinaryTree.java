package com.silentanonym.interviewprep.tree;

public class MaximumDepthOfBinaryTree {

    // Recursive
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}

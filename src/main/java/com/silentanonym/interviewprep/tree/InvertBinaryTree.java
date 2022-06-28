package com.silentanonym.interviewprep.tree;

public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;

        // Swap
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}

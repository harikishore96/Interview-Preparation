package com.silentanonym.interviewprep.tree;

import org.junit.jupiter.api.Test;

class InvertBinaryTreeTest {

    InvertBinaryTree invertBinaryTree = new InvertBinaryTree();

    @Test
    public void invertTree() {
        TreeNode root = new TreeNode(2).left(1).right(3);
        print(root);
        TreeNode actual = invertBinaryTree.invertTree(root);
        print(actual);
    }

    private void print(TreeNode root) {
        if (root == null) return;
        if (root.left != null && root.right != null) System.out.println("Root: " + root.val);
        if (root.left != null) System.out.println("Left: " + root.left.val);
        if (root.right != null) System.out.println("Right: " + root.right.val);
        print(root.left);
        print(root.right);
    }
}

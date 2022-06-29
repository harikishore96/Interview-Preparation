package com.silentanonym.interviewprep.tree;

import org.junit.jupiter.api.Test;

class InsertIntoABinarySearchTreeTest {

    InsertIntoABinarySearchTree insertIntoABinarySearchTree = new InsertIntoABinarySearchTree();

    @Test
    void insertIntoBST() {
        TreeNode level2LST = new TreeNode(2).left(1).right(3);
        TreeNode root = new TreeNode(4).left(level2LST).right(7);
        TreeNode actual = insertIntoABinarySearchTree.insertIntoBST(root, 5);
        print(actual, 1);
    }

    private void print(TreeNode root, int level) {
        if (root == null) return;
        System.out.println("Level " + level);
        if (root.left != null && root.right != null) System.out.println("  Root: " + root.val);
        if (root.left != null) System.out.println("  Left: " + root.left.val);
        if (root.right != null) System.out.println("  Right: " + root.right.val);
        print(root.left, level + 1);
        print(root.right, level + 1);
    }
}

package com.silentanonym.interviewprep.tree;

import org.junit.jupiter.api.Test;

class SearchInABinarySearchTreeTest {

    SearchInABinarySearchTree searchInABinarySearchTree = new SearchInABinarySearchTree();

    @Test
    void searchBST() {
        TreeNode level2LST = new TreeNode(2).left(1).right(3);
        TreeNode root = new TreeNode(4).left(level2LST).right(7);
        TreeNode actual = searchInABinarySearchTree.searchBST(root, 2);
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

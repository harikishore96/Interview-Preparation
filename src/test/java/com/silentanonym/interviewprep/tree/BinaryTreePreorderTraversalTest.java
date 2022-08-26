package com.silentanonym.interviewprep.tree;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinaryTreePreorderTraversalTest {

    BinaryTreePreorderTraversal binaryTreePreorderTraversal = new BinaryTreePreorderTraversal();

    @Test
    void preorderTraversal() {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        int[] expected = {1, 2, 3};
        List<Integer> preorder = binaryTreePreorderTraversal.preorderTraversal(root);
        int[] actual = preorder.stream().mapToInt(i -> i).toArray();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void preorderTraversalRecursive() {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        int[] expected = {1, 2, 3};
        List<Integer> preorder = binaryTreePreorderTraversal.preorderTraversalRecursive(root);
        int[] actual = preorder.stream().mapToInt(i -> i).toArray();
        Assertions.assertArrayEquals(expected, actual);
    }
}

package com.silentanonym.interviewprep.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

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
}

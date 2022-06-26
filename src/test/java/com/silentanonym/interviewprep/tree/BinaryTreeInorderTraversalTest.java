package com.silentanonym.interviewprep.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class BinaryTreeInorderTraversalTest {

    BinaryTreeInorderTraversal binaryTreeInorderTraversal = new BinaryTreeInorderTraversal();

    @Test
    void inorderTraversal() {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        int[] expected = {1, 3, 2};
        List<Integer> inorder = binaryTreeInorderTraversal.inorderTraversal(root);
        int[] actual = inorder.stream().mapToInt(i -> i).toArray();
        Assertions.assertArrayEquals(expected, actual);
    }
}

package com.silentanonym.interviewprep.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class BinaryTreePostorderTraversalTest {

    BinaryTreePostorderTraversal binaryTreePostorderTraversal = new BinaryTreePostorderTraversal();

    @Test
    void postorderTraversal() {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        int[] expected = {3, 2, 1};
        List<Integer> postorder = binaryTreePostorderTraversal.postorderTraversal(root);
        int[] actual = postorder.stream().mapToInt(i -> i).toArray();
        Assertions.assertArrayEquals(expected, actual);
    }
}

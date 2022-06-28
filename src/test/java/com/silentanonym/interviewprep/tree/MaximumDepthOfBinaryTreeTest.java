package com.silentanonym.interviewprep.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaximumDepthOfBinaryTreeTest {

    MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();

    @Test
    void maxDepth() {
        TreeNode level2RST = new TreeNode(20).left(15).right(7);
        TreeNode root = new TreeNode(3).left(9).right(level2RST);
        int actual = maximumDepthOfBinaryTree.maxDepth(root);
        Assertions.assertEquals(3, actual);
    }
}

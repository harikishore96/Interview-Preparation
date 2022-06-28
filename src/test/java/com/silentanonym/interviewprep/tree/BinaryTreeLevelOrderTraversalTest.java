package com.silentanonym.interviewprep.tree;

import org.junit.jupiter.api.Test;

import java.util.List;

class BinaryTreeLevelOrderTraversalTest {

    BinaryTreeLevelOrderTraversal binaryTreeLevelOrderTraversal = new BinaryTreeLevelOrderTraversal();

    @Test
    void levelOrder() {
        TreeNode level2RST = new TreeNode(20).left(15).right(7);
        TreeNode root = new TreeNode(3).left(9).right(level2RST);
        List<List<Integer>> levelOrder = binaryTreeLevelOrderTraversal.levelOrder(root);
        System.out.println(levelOrder);
    }
}

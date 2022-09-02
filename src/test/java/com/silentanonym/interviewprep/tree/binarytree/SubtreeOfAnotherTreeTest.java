package com.silentanonym.interviewprep.tree.binarytree;

import com.silentanonym.interviewprep.tree.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SubtreeOfAnotherTreeTest {

  SubtreeOfAnotherTree subtreeOfAnotherTree = new SubtreeOfAnotherTree();

  @Test
  void isSubtree() {
    TreeNode subRoot = new TreeNode(4, new TreeNode(1), new TreeNode(2));
    TreeNode root = new TreeNode(1, subRoot, new TreeNode(5));
    Assertions.assertTrue(subtreeOfAnotherTree.isSubtree(root, subRoot));
  }
}

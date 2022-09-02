package com.silentanonym.interviewprep.tree.binarytree;

import com.silentanonym.interviewprep.tree.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SameTreeTest {

  SameTree sameTree = new SameTree();

  @Test
  void isSameTree() {
    TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
    TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));
    Assertions.assertTrue(sameTree.isSameTree(p, q));
  }
}

package com.silentanonym.interviewprep.tree.bst;

import com.silentanonym.interviewprep.tree.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidateBinarySearchTreeTest {

  ValidateBinarySearchTree validateBinarySearchTree = new ValidateBinarySearchTree();

  @Test
  void isValidBSTTrue() {
    TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
    Assertions.assertTrue(validateBinarySearchTree.isValidBST(root));
  }

  @Test
  void isValidBSTFalse() {
    TreeNode rsb1 = new TreeNode(4, new TreeNode(3), new TreeNode(6));
    TreeNode root = new TreeNode(5, new TreeNode(1), rsb1);
    Assertions.assertFalse(validateBinarySearchTree.isValidBST(root));
  }
}

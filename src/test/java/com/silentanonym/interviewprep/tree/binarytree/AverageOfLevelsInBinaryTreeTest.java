package com.silentanonym.interviewprep.tree.binarytree;

import static org.hamcrest.MatcherAssert.assertThat;

import com.silentanonym.interviewprep.tree.TreeNode;
import java.util.List;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

class AverageOfLevelsInBinaryTreeTest {

  AverageOfLevelsInBinaryTree averageOfLevelsInBinaryTree = new AverageOfLevelsInBinaryTree();

  @Test
  void averageOfLevels() {
    TreeNode rsb1 = new TreeNode(20, new TreeNode(15), new TreeNode(7));
    TreeNode root = new TreeNode(3, new TreeNode(9), rsb1);
    List<Double> actual = averageOfLevelsInBinaryTree.averageOfLevels(root);
    Double[] expected = new Double[]{3.00000, 14.50000, 11.00000};
    assertThat(actual, Matchers.containsInAnyOrder(expected));
  }

  @Test
  void averageOfLevels1() {
    TreeNode lsb1 = new TreeNode(9, new TreeNode(15), new TreeNode(7));
    TreeNode root = new TreeNode(3, lsb1, new TreeNode(20));
    List<Double> actual = averageOfLevelsInBinaryTree.averageOfLevels(root);
    Double[] expected = new Double[]{3.00000, 14.50000, 11.00000};
    assertThat(actual, Matchers.containsInAnyOrder(expected));
  }
}

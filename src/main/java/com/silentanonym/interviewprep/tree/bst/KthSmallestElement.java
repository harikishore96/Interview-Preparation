package com.silentanonym.interviewprep.tree.bst;

import com.silentanonym.interviewprep.tree.TreeNode;

public class KthSmallestElement {
  int result = 0;
  int globalK = 0;
  public int kthSmallest(TreeNode root, int k) {
    globalK = k;
    inorder(root);
    return result;
  }

  private void inorder(TreeNode root) {
    if(root == null) return;
    inorder(root.left);
    --globalK;
    if(globalK == 0) {
      result = root.val;
      return;
    }
    inorder(root.right);
  }
}

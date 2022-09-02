package com.silentanonym.interviewprep.tree.binarytree;

import com.silentanonym.interviewprep.tree.TreeNode;

public class SubtreeOfAnotherTree {
  public boolean isSubtree(TreeNode root, TreeNode subRoot) {
    if(subRoot == null) return true;
    if(root == null) return false;

    if(sameTree(root, subRoot)) return true;
    return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
  }

  private boolean sameTree(TreeNode p, TreeNode q) {
    if(p == null && q == null) return true;
    if(p == null || q == null) return false;
    if(p.val != q.val) return false;
    return sameTree(p.left, q.left) && sameTree(p.right, q.right);
  }
}

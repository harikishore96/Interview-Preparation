package com.silentanonym.interviewprep.tree.bst;

import com.silentanonym.interviewprep.tree.TreeNode;

public class LowestCommonAncestor {
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if(root == null) return null;
    if(root.val > p.val && root.val > q.val) return lowestCommonAncestor(root.left, p, q);
    if(root.val < p.val && root.val < q.val) return lowestCommonAncestor(root.right, p,q);
    return root;
  }
}

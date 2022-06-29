package com.silentanonym.interviewprep.tree;

public class InsertIntoABinarySearchTree {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        TreeNode dummy = root;

        while (true) {
            if (val > dummy.val) {
                if (dummy.right != null) dummy = dummy.right;
                else {
                    dummy.right = new TreeNode(val);
                    break;
                }
            } else if (val < dummy.val) {
                if (dummy.left != null) dummy = dummy.left;
                else {
                    dummy.left = new TreeNode(val);
                    break;
                }
            }
        }
        return root;
    }
}

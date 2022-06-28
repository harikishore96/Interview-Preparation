package com.silentanonym.interviewprep.tree;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode left(int val) {
        this.left = new TreeNode(val);
        return this;
    }

    public TreeNode right(int val) {
        this.right = new TreeNode(val);
        return this;
    }

    public TreeNode right(TreeNode right) {
        this.right = right;
        return this;
    }
}

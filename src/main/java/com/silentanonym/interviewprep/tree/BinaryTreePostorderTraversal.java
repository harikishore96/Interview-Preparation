package com.silentanonym.interviewprep.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {

    // Iterative
    public List<Integer> postorderTraversal(TreeNode root) {
        return postorderTraversal(root, new ArrayList<>());
    }

    public List<Integer> postorderTraversal(TreeNode root, List<Integer> postorder) {
        if (root == null) return postorder;
        postorder = postorderTraversal(root.left, postorder);
        postorder = postorderTraversal(root.right, postorder);
        postorder.add(root.val);
        return postorder;
    }
}

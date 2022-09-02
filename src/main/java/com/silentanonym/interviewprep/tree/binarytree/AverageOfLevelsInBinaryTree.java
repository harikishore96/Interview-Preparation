package com.silentanonym.interviewprep.tree.binarytree;

import com.silentanonym.interviewprep.tree.TreeNode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class AverageOfLevelsInBinaryTree {
  public List<Double> averageOfLevels(TreeNode root) {
    List<Double> result = new ArrayList<>();
    Deque<TreeNode> queue = new ArrayDeque<>();
    queue.offer(root);
    while(queue.size() != 0) {
      int size = queue.size();
      long sum = 0;
      for(int i = 0; i < size;i++) {
        TreeNode curr = queue.poll();
        sum += curr.val;
        if(curr.left != null) queue.offer(curr.left);
        if(curr.right != null) queue.offer(curr.right);
      }
      result.add((double)sum/size);
    }
    return result;
  }
}

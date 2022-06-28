package com.silentanonym.interviewprep.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PathSumTest {

    PathSum pathSum = new PathSum();

    @Test
    void hasPathSum() {

        TreeNode level4LST = new TreeNode(11).left(7).right(2);
        TreeNode level4RST = new TreeNode(4).right(1);
        TreeNode level2LST = new TreeNode(4).left(level4LST);
        TreeNode level2RST = new TreeNode(8).left(13).right(level4RST);
        TreeNode root = new TreeNode(5).left(level2LST).right(level2RST);
        Assertions.assertTrue(pathSum.hasPathSum(root, 22));


        root = new TreeNode(1).left(2).right(3);
        Assertions.assertFalse(pathSum.hasPathSum(root, 5));
    }
}

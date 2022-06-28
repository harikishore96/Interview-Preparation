package com.silentanonym.interviewprep.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SymmetricTreeTest {

    SymmetricTree symmetricTree = new SymmetricTree();

    @Test
    void isSymmetric() {
        TreeNode level2LST = new TreeNode(2).left(3).right(4);
        TreeNode level2RST = new TreeNode(2).left(4).right(3);
        TreeNode root = new TreeNode(1).left(level2LST).right(level2RST);
        Assertions.assertTrue(symmetricTree.isSymmetric(root));


        level2LST = new TreeNode(2).right(3);
        level2RST = new TreeNode(2).right(3);
        root = new TreeNode(1).left(level2LST).right(level2RST);
        Assertions.assertFalse(symmetricTree.isSymmetric(root));
    }
}

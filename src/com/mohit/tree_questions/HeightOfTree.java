package com.mohit.tree_questions;

import com.mohit.data_structures.TreeNode;

public class HeightOfTree {
    public static int getHeightOfTree(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }else {
            return Math.max(getHeightOfTree(treeNode.left), getHeightOfTree(treeNode.right)) + 1;
        }
    }
}

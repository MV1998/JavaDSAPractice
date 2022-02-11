package com.mohit.tree_questions;

import com.mohit.data_structures.TreeNode;

public class CheckBalancedBinaryTree {
    public int isBalanced(TreeNode treeNode) {
        if (treeNode == null) return 0;
        int lh = isBalanced(treeNode.left);
        if (lh == -1) return -1;
        int rh = isBalanced(treeNode.right);
        if (rh == -1) return  -1;
        if (Math.abs(lh-rh) > 1) return  -1;
        return Math.max(lh, rh) + 1;
    }
}

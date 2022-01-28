package com.mohit.tree_questions;

import com.mohit.data_structures.TreeNode;

public class MaximumInBinaryTree {
    int maximum = 0;
    public int getMaximum(TreeNode node) {
        if (node != null) {
            getMaximum(node.left);
            maximum = Math.max(maximum, node.data);
            getMaximum(node.right);
        }
        return maximum;
    }

    public int getMax(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return Math.max(node.data, Math.max(getMax(node.left), getMax(node.right)));
    }
}

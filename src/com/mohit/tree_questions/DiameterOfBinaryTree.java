package com.mohit.tree_questions;

import com.mohit.data_structures.TreeNode;

public class DiameterOfBinaryTree {
    private int height(TreeNode node) {
        if (node == null) return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }

    public int diameter(TreeNode node) {
        if (node == null) return 0;
        int d1 = 1 + height(node.left) + height(node.right);
        int d2 = diameter(node.left);
        int d3 = diameter(node.right);
        return Math.max(d1, Math.max(d2, d3));
    }
    int res = 0;
    public int diameterWithHeight(TreeNode treeNode) {
        if (treeNode == null) return 0;

        int lh = height(treeNode.left);
        int rh = height(treeNode.right);
        res = Math.max(res, 1 + lh + rh);
        return  1 + Math.max(lh, rh);
    }
}

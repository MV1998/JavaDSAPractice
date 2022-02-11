package com.mohit.tree_questions;

import com.mohit.data_structures.TreeNode;

public class ChildrenSumProperty {
    public boolean isSum(TreeNode treeNode) {
        if (treeNode == null) return true;
        if (treeNode.left == null && treeNode.right == null) return true;

        int sum = 0;
        if (treeNode.left != null) sum += treeNode.left.data;
        if (treeNode.right != null) sum += treeNode.right.data;
        return (treeNode.data == sum && isSum(treeNode.left) && isSum(treeNode.right));
    }
}

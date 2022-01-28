package com.mohit.tree_questions;

import com.mohit.data_structures.TreeNode;

public class SizeOfBinaryTree {
    int size = 0;
    public int getSizeOfTree(TreeNode node) {
        if (node != null) {
            getSizeOfTree(node.left);
            size++;
            getSizeOfTree(node.right);
        }
        return size;
    }

    public int getSize(TreeNode node) {
        if (node == null) return 0;
        return 1 + getSize(node.left) + getSize(node.right);
    }
}

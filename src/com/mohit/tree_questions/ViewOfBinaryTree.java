package com.mohit.tree_questions;

import com.mohit.data_structures.TreeNode;

public class ViewOfBinaryTree {
    //o(n)
    int maxLevel = 0;
    public void leftView(TreeNode node, int level) {
        if (node == null) return;
        if (maxLevel < level) {
            System.out.println(node.data);
            maxLevel = level;
        }
        leftView(node.left, level+1);
        leftView(node.right, level+1);
    }

    public void rightView(TreeNode node, int level) {
        if (node == null) return;
        if (maxLevel < level) {
            System.out.println(node.data);
            maxLevel = level;
        }
        leftView(node.right, level+1);
        leftView(node.left, level+1);
    }

    public void printView(TreeNode node) {
        System.out.println("Left View");
        leftView(node, 1);
        System.out.println("Right View");
        maxLevel = 0;
        rightView(node, 1);
    }
}

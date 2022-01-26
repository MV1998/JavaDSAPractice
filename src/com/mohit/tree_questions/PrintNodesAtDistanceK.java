package com.mohit.tree_questions;

import com.mohit.data_structures.TreeNode;

public class PrintNodesAtDistanceK {
    public static void printNodesAtDistanceK(TreeNode treeNode, int k) {
        if (treeNode == null) return;
        if (k == 0) System.out.println(treeNode.data);
        else {
            printNodesAtDistanceK(treeNode.left, k - 1);
            printNodesAtDistanceK(treeNode.right, k - 1);
        }
    }
}

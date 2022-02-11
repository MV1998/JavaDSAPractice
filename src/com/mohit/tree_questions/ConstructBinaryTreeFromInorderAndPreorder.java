package com.mohit.tree_questions;

import com.mohit.data_structures.TreeNode;

public class ConstructBinaryTreeFromInorderAndPreorder {
    static int preIndex = 0;
    public TreeNode cTree(int[] in, int[] pre, int is, int ie) {
        if (is > ie) return null;

        TreeNode root = new TreeNode(pre[preIndex++]);

        int inIndex = is;
        for (int i = is; i <= ie; i++) {
            if (in[i] == root.data) {
                inIndex = i;
                break;
            }
        }

        root.left = cTree(in, pre, is, inIndex - 1);
        root.right = cTree(in, pre, inIndex + 1, ie);
        return root;
    }
}

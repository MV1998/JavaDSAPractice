package com.mohit.tree_questions;

import com.mohit.data_structures.TreeNode;

public class ConvertBinaryTreeToDLL {
    private TreeNode prev = null;
    public TreeNode convert(TreeNode root) {
        if (root == null) return root;

        TreeNode head = convert(root.left);

        if (prev == null) {
            head = root;
        }else {
            root.left = prev;
            prev.right = root;
        }
        prev = root;

        convert(root.right);
        return head;
    }
}

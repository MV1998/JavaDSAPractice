package com.mohit.tree_questions.binary_search_tree;

import com.mohit.data_structures.TreeNode;

public class DeleteBST {
    public TreeNode deleteBSTS(TreeNode root, int key) {
        if (root == null) return null;

        if (key < root.data) {
            root.left = deleteBSTS(root.left, key);
        }else if (key > root.data) {
            root.right = deleteBSTS(root.right, key);
        }else{
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;
            else {
                TreeNode successor = getSuccessor(root);
                root.data = successor.data;
                root.right = deleteBSTS(root.right, successor.data);
            }
        }
        return root;
    }

    public TreeNode getSuccessor(TreeNode node) {
        TreeNode curr = node.right;
        while (curr != null && curr.left != null) {
            curr = curr.left;
        }
        return curr;
    }

}

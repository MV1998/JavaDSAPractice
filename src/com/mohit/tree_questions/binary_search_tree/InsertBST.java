package com.mohit.tree_questions.binary_search_tree;

import com.mohit.data_structures.TreeNode;

public class InsertBST {
    public TreeNode insertBST(TreeNode node, int key) {
        if (node == null) {
            return new TreeNode(key);
        }

        if (key < node.data) node.left = insertBST(node.left, key);
        else node.right = insertBST(node.right, key);
        return node;
    }

    public TreeNode iterativeInsertBST(TreeNode node, int key) {
        TreeNode temp = new TreeNode(key);
        TreeNode parent = null, curr = node;

        while (curr != null) {
            parent = node;

            if (key < curr.data) {
                curr = curr.left;
            }else if (key > curr.data) {
                curr = curr.right;
            }else{
                return node;
            }
        }

        if (parent == null) {
            return  temp;
        }else if (key < parent.data) {
            parent.left = temp;
        }else {
            parent.right = temp;
        }
        return node;
    }
}

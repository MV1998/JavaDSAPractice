package com.mohit.tree_questions.binary_search_tree;

import com.mohit.data_structures.TreeNode;
import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class KthSmallestElement {

    public TreeNode insertNode(TreeNode node, int element) {
        TreeNode temp = new TreeNode(element);
        if (node == null) return temp;

        if (element < node.data) {
            node.left = insertNode(node.left, element);
        }
        else {
            node.right = insertNode(node.right, element);
        }
        return node;
    }

    public boolean searchNode(TreeNode node, int element) {
        if (node == null) {
            return false;
        }

        if (node.data == element) {
            return true;
        }else if (node.left != null) {
            return searchNode(node.left, element);
        }
        return searchNode(node.right, element);
    }


    public TreeNode delete(TreeNode node, int element) {
        if (node == null) return null;
        if (node.data == element) {
            node.right.left = node.left;
            return node;
        }else if (element < node.data) {
            return delete(node.left, element);
        }else {
            return delete(node.right, element);
        }
    }

    List<Integer> list = new ArrayList<>();
    public void printNodes(TreeNode node) {
        if (node != null) {
            printNodes(node.left);
            list.add(node.data);
            printNodes(node.right);
        }
    }

    int count = 0;
    public void KthSmallest(TreeNode node, int k) {
        if (node != null) {
            KthSmallest(node.right, k);
            count++;
            if (count == k) {
                System.out.println(node.data);
            }
            KthSmallest(node.left, k);
        }
    }
}

package com.mohit.tree_questions;

import com.mohit.data_structures.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    // Time complexity of this code is Theta(N)
    public static void printLevelOrderTraversal(TreeNode treeNode) {
        if (treeNode == null) return;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(treeNode);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.println(node.data);
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
    }

    public static void printLevelOrderTraversalLineByLine(TreeNode node) {
        if (node == null) return;;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        queue.add(null);
        while (queue.size() > 1) {
            TreeNode treeNode = queue.poll();
            if (treeNode == null) {
                System.out.print(" ");
                queue.add(null);
                continue;
            }
            System.out.print(treeNode.data+" ");
            if (treeNode.left != null) queue.add(treeNode.left);
            if (treeNode.right != null) queue.add(treeNode.right);
        }
    }

    public static void printLevelOrderTraversalThirdMethod(TreeNode node) {
        if (node == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            int count = queue.size();
            for (int i = 0; i < count; i++) {
                TreeNode currentNode = queue.poll();
                System.out.println(currentNode.data);
                if (currentNode.left != null) queue.add(currentNode.left);
                if (currentNode.right != null) queue.add(currentNode.right);
            }
            System.out.println();
        }
    }
}

package com.mohit.leetcode;

import com.mohit.data_structures.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidthOfBinary {
    public int widthOfBinaryTree(TreeNode root) {

        if (root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int maxWidth = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            maxWidth = Math.max(maxWidth, size);
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }

        return maxWidth;
    }
}

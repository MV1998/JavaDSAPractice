package com.mohit.tree_questions;

import com.mohit.data_structures.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidthOfBinaryTree {
    public int getWidth(TreeNode node) {
        if (node == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);

        int res = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            res = Math.max(res, size);

            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                if (curr.left != null) queue.add(curr.left);
                if (curr.right != null) queue.add(curr.right);
            }
        }
        return res;
    }
}

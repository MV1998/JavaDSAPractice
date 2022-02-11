package com.mohit.tree_questions;

import com.mohit.data_structures.TreeNode;
import com.sun.security.auth.UnixNumericGroupPrincipal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeTraversalInSpiralForm {
    // Method 1
    public void spiralTraversal(TreeNode treeNode) {
        if (treeNode == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        boolean reverse = false;

        queue.add(treeNode);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();

                if (reverse) {
                    stack.add(curr.data);
                }else {
                    System.out.print(curr.data+" ");
                }
                if (curr.left != null) queue.add(curr.left);
                if (curr.right != null) queue.add(curr.right);
            }
            if (reverse) {
                while (!stack.isEmpty()) {
                    System.out.print(stack.pop()+" ");
                }
            }
            reverse = !reverse;
            System.out.println();
        }
    }

    public void spiralTraversalMethod2(TreeNode treeNode) {
        if (treeNode == null) return;

        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();

        s1.add(treeNode);

        while (!s1.isEmpty() || !s2.isEmpty()) {


            while (!s1.isEmpty()) {
                TreeNode temp = s1.peek();
                s1.pop();

                System.out.print(temp.data+" ");
                if (temp.left != null) s2.add(temp.left);
                if (temp.right != null) s2.add(temp.right);
            }

            while (!s2.isEmpty()) {
                TreeNode temp = s2.peek();
                s2.pop();
                System.out.print(temp.data+" ");
                if (temp.right != null) s1.add(temp.right);
                if (temp.left != null) s1.add(temp.left);
            }
        }
    }
}
package com.mohit.tree_questions.binary_search_tree;

import com.mohit.data_structures.TreeNode;

import java.util.*;

public class Main {
    public  static void main(String[] args) {
        KthSmallestElement kthSmallestElement = new KthSmallestElement();

        TreeNode head = new TreeNode(10);
        head = kthSmallestElement.insertNode(head, 5);
        head = kthSmallestElement.insertNode(head, 15);
        head = kthSmallestElement.insertNode(head, 20);
        head = kthSmallestElement.insertNode(head, 2);



        System.out.println("kth smallest element ");
        kthSmallestElement.KthSmallest(head, 2);
    }
}

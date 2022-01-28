package com.mohit.tree_questions;

import com.mohit.data_structures.TreeNode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AllElementsinTwoBinarySearchTrees {
    List<Integer> integers = new ArrayList<>();
    public  List<Integer> printAllElementsinTwoBinarySearchTrees(TreeNode node1, TreeNode node2) {
        this.inOrderTraversal(node1);
        inOrderTraversal(node2);
        integers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return integer.compareTo(t1);
            }
        });
        return integers;
    }
    public void inOrderTraversal(TreeNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            integers.add(node.data);
            inOrderTraversal(node.right);
        }
    }
}

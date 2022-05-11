package com.mohit.tree_questions.binary_search_tree;

import com.mohit.data_structures.TreeNode;

public class FloorInBST {
    public TreeNode getFloor(TreeNode node, int floorOfKey) {
        TreeNode res = null;

        while (node != null) {
            if (node.data == floorOfKey) {
                return node;
            }else if (floorOfKey < node.data) {
                node = node.left;
            }else{
                res = node;
                node = node.right;
            }
        }
        return res;
    }
}

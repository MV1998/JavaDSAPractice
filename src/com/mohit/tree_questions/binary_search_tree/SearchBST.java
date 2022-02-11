package com.mohit.tree_questions.binary_search_tree;

import com.mohit.data_structures.TreeNode;

public class SearchBST {

    /**
     *
     * Time complexity of this algorithm is O(h), height of the tree
     * Auxiliary Space O(h), because in function call stack every called node
     * waits for its caller to finish.
     *
     * @param node root node of the tree
     * @param key key to be find in bst.
     * @return true if key is present, false otherwise
     */
    public boolean searchBST(TreeNode node, int key) {
        if (node == null) return false;
        if (node.data == key) return true;

        if (key < node.data) {
            return searchBST(node.left, key);
        }else {
            return searchBST(node.right, key);
        }
    }
}

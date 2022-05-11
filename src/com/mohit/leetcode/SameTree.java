package com.mohit.leetcode;

import com.mohit.data_structures.TreeNode;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.data != q.data) return false;
        return isSameTree(p.left , q.left) && isSameTree(p.right, q.right);
    }
}
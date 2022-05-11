package com.mohit.leetcode;

import com.mohit.data_structures.TreeNode;

import java.util.ArrayList;

public class PathSum {

    public void getPathRootToLeaf(TreeNode node, int arr[], int len, ArrayList<ArrayList<Integer>> list) {

        if (node == null) {
            return;
        }

        arr[len] = node.data;
        len++;

        if (node.left == null && node.right == null) {
            insertPaths(arr, len, list);
        }else {
            getPathRootToLeaf(node.left, arr, len, list);
            getPathRootToLeaf(node.right, arr, len, list);
        }
    }

    public void insertPaths(int[] arr, int len , ArrayList<ArrayList<Integer>> list) {
        ArrayList<Integer> pathList = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            pathList.add(arr[i]);
        }
        list.add(pathList);
    }

    public ArrayList<ArrayList<Integer>> pathSumWithTarget(ArrayList<ArrayList<Integer>> list, int target) {
        ArrayList<ArrayList<Integer>> outputList = new ArrayList<>();
        for (ArrayList<Integer> outList : list) {
            int sum = 0;
            for (Integer x : outList) {
                sum += x;
            }
            if (sum == target) {
                outputList.add(outList);
            }
        }
        return outputList;
    }
}

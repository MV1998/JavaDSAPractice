package com.mohit.leetcode;

import com.google.gson.Gson;
import com.mohit.data_structures.Node;
import com.mohit.data_structures.TreeNode;
import com.mohit.leetcode.desing_underground_system.UndergroundSystem;
import com.mohit.tree_questions.MaximumInBinaryTree;
import com.mohit.tree_questions.MaximumWidthOfBinaryTree;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
//        String s = "MOHIT";
//        int rows = 3;
//
//        System.out.println(zigZagConversion(s, rows));
//
//
//        int[][] intervals = {{1,4}, {3,6}, {2,8}};
//        System.out.println(new RemoveCoveredElements().getCount(intervals));
//
//        // Column number from column title
//        ExcelSheetColumnNumber columnNumber = new ExcelSheetColumnNumber();
//        System.out.println(columnNumber.getColumnNumber("ZY"));
//
//
//        System.out.println("CountOfSmallerNumberAfterSelf");
//        new CountOfSmallerNumberAfterSelf().count();
//
//
//        System.out.println("Sorted Colors");
//        new SortColors().sort();
//
//
//        System.out.println("Transition point " + new TransitionPoint().getPoint());
//
//
//        System.out.println("count8 " + count8(2348));
//
//
//
//        System.out.println("maximum width");
//        TreeNode node = new TreeNode(1);
//        node.left = new TreeNode(3);
//        node.right = new TreeNode(2);
//        node.left.left = new TreeNode(5);
//
//        System.out.println("right :  " + new MaximumWidthOfBinary().widthOfBinaryTree(node));
//        System.out.println("from standard : " + new MaximumWidthOfBinaryTree().getWidth(node));
//
//
//        SameTree sameTree = new SameTree();
//        TreeNode p = new TreeNode(1);
//        p.left = new TreeNode(2);
//
//        TreeNode q = new TreeNode(1);
//        q.right = new TreeNode(2);
//        sameTree.isSameTree(p, q);
//
//
//        System.out.println("path sum ");
//        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//        PathSum pathSum = new PathSum();
//
//        int[] arr = new int[1000];
//
//
//        TreeNode treeNode = new TreeNode(1);
//        treeNode.left = new TreeNode(2);
//        treeNode.right = new TreeNode(3);
//        treeNode.right.left = new TreeNode(10);
//
//        pathSum.getPathRootToLeaf(treeNode, arr, 0, list);
//
//
//        System.out.println("after getPathRootToLeaf called");
//        System.out.println(new Gson().toJson(list));
//
//        System.out.println("target : " + pathSum.pathSumWithTarget(list, 3));
//
//
//
//
//
//
//        RemoveDuplicateElementsFromList removeDuplicateElementsFromList = new RemoveDuplicateElementsFromList();
//
//        Node node1 = new Node(-3);
//        node1.next  = new Node(-1);
//        node1.next.next = new Node(0);
//        node1.next.next.next = new Node(0);
//        node1.next.next.next.next = new Node(0);
//        node1.next.next.next.next.next = new Node(3);
//        node1.next.next.next.next.next.next = new Node(3);
//
//        Node node2 = removeDuplicateElementsFromList.removeList(node1);
//        while (node2 != null) {
//            System.out.println(node2.data);
//            node2 = node2.next;
//        }
//
//



        // Underground system runner code;

        UndergroundSystem undergroundSystem = new UndergroundSystem();
        undergroundSystem.checkIn(10, "Leyton", 3);
        undergroundSystem.checkOut(10, "Paradise", 8);
        System.out.println(undergroundSystem.getAverageTime("Leyton", "Paradise"));
        undergroundSystem.checkIn(5, "Leyton", 10);
        undergroundSystem.checkOut(5, "Paradise", 16);
        System.out.println(undergroundSystem.getAverageTime("Leyton", "Paradise"));
        undergroundSystem.checkIn(2, "Leyton", 21);
        undergroundSystem.checkOut(2, "Paradise", 30);
        System.out.println(undergroundSystem.getAverageTime("Leyton", "Paradise"));
    }

    static String zigZagConversion(String s, int rows) {
        if (rows == 1) return s;

        StringBuilder stringBuilder = new StringBuilder();
        int n = s.length();
        int increment = 2 * rows - 2;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j + i < n; j = j + increment) {
                stringBuilder.append(s.charAt(i + j));
                if (i != 0 && i != rows-1 && j + increment - i < n) {
                    stringBuilder.append(s.charAt(j + increment - i));
                }
            }
        }
        return stringBuilder.toString();
    }

    static boolean isTrue = false;
    static public int count8(int n) {
        if (n == 0) return 0;
        if (n % 10 != 8) {
            isTrue = false;
            return count8(n / 10);
        }
        if (isTrue) {
            return 2 + count8(n / 10);
        }
        isTrue = true;
        return 1 + count8(n / 10);
    }

}

package com.mohit;

import com.mohit.data_structures.Queue.MLinkedListQueue;
import com.mohit.data_structures.Node;
import com.mohit.data_structures.TreeNode;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            }catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static class FastWriter {
        private final BufferedWriter br;

        FastWriter() {
            br = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        void print(Object object) throws IOException {
            br.append("").append(String.valueOf(object));
        }

        void println(Object object) throws IOException{
            print(object);
            br.append("\n");
        }

        void close() throws IOException{
            br.close();
        }
    }
    public static void main(String[] args) {
        try {
            FastReader s = new FastReader();
            FastWriter f = new FastWriter();

            TreeNode treeNode = new TreeNode(10);
            treeNode.left = new TreeNode(20);
            treeNode.right = new TreeNode(30);
            treeNode.right.left = new TreeNode(40);
            treeNode.right.right = new TreeNode(50);

            System.out.println("In Order Traversal");
            inOrderTraversal(treeNode);
            System.out.println("Pre Order Traversal");
            preOrderTraversal(treeNode);
            System.out.println("Post Order Traversal");
            postOrderTraversal(treeNode);
            f.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }


    static void inOrderTraversal(TreeNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.data + " ");
            inOrderTraversal(node.right);
        }
    }

    static void preOrderTraversal(TreeNode node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    static void postOrderTraversal(TreeNode node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }

    static void printList(Node head) {
        Node curr = head;
        while(curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}

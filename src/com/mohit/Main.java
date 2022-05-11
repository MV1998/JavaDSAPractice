package com.mohit;

import com.mohit.data_structures.Node;
import com.mohit.data_structures.TreeNode;
import com.mohit.recursion.AddTwoNumber;
import com.mohit.recursion.SubSequencesOfArray;
import com.mohit.tree_questions.*;
import com.mohit.tree_questions.binary_search_tree.CeilingOnTheLeftSideOfArray;
import com.mohit.tree_questions.binary_search_tree.FloorInBST;
import com.mohit.tree_questions.binary_search_tree.InsertBST;
import com.mohit.tree_questions.binary_search_tree.SearchBST;

import java.io.*;
import java.util.*;

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
            treeNode.right = new TreeNode(80);
            treeNode.right.left = new TreeNode(40);
            treeNode.right.right = new TreeNode(50);

            System.out.println("height of tree is : " + HeightOfTree.getHeightOfTree(treeNode));
            PrintNodesAtDistanceK.printNodesAtDistanceK(treeNode, 2);
            LevelOrderTraversal.printLevelOrderTraversal(treeNode);

            TreeNode node1 = new TreeNode(2);
            node1.left = new TreeNode(1);
            node1.right = new TreeNode(4);

            TreeNode node2 = new TreeNode(1);
            node2.left = new TreeNode(0);
            node2.right = new TreeNode(3);

            //System.out.println("result : "+ new AllElementsinTwoBinarySearchTrees().printAllElementsinTwoBinarySearchTrees(node1, node2));
            System.out.println("\n");
            LevelOrderTraversal.printLevelOrderTraversalLineByLine(treeNode);

            LevelOrderTraversal.printLevelOrderTraversalThirdMethod(treeNode);

            System.out.println("size of tree : " + new SizeOfBinaryTree().getSize(node1));
            System.out.println("Maximum in tree : " + new MaximumInBinaryTree().getMax(treeNode));

            new ViewOfBinaryTree().printView(treeNode);


            TreeNode sumTree = new TreeNode(10);
            sumTree.left = new TreeNode(8);
            sumTree.right = new TreeNode(1);

            System.out.println("Is sum : " + new ChildrenSumProperty().isSum(sumTree));

            f1(10);

            print1ToN(10);

            System.out.println();

            printNto1(10);





            Node node3 = new Node(2);
            node3.next = new Node(4);
            node3.next.next = new Node(3);

            Node node4 = new Node(5);
            node4.next = new Node(6);
            node4.next.next = new Node(4);

            Node head = new AddTwoNumber().addNumber(node3, node4);

            System.out.println("Adding two number");
            while (head != null) {
                System.out.println(head.data);
                head = head.next;
            }


            System.out.println("Maximum width: " + new MaximumWidthOfBinaryTree().getWidth(treeNode));


            int[] arrays = {1,2,3,4,5};
            reverse(arrays, 0, arrays.length);
            for (int i = 0; i < arrays.length; i++) {
                System.out.print(arrays[i]+" ");
            }


            TreeNode btToDLL = new TreeNode(10);
            btToDLL.left = new TreeNode(5);
            btToDLL.right = new TreeNode(20);
            btToDLL.right.left = new TreeNode(30);
            btToDLL.right.right = new TreeNode(35);

            System.out.println("bt to dll");
            TreeNode dll = new ConvertBinaryTreeToDLL().convert(btToDLL);
            printDLL(dll);


            System.out.println("Palindrome check");
            String s1 = "A man, a plan, a canal: Panama".replaceAll("[^A-Za-z0-9]", "").toLowerCase();


            String[] words = {"abc","car","ada","racecar","cool"};
            for (int i = 0; i < words.length; i++) {
                if (palindrome(words[i], 0, words[i].length())) {
                    System.out.println(words[i]);
                    break;
                }
            }

            System.out.println(palindrome(s1, 0, s1.length()));


            System.out.println("construct tree");
            int[] in = {20, 10, 40, 30, 50};
            int[] pre = {10, 20, 30, 40, 50};
            TreeNode constructedTree = new ConstructBinaryTreeFromInorderAndPreorder().cTree(in, pre, 0, in.length-1);

            System.out.println("In Order Traversal after constructed tree");
            inOrderTraversal(constructedTree);

            System.out.println("\nPre Order Traversal after constructed tree");
            preOrderTraversal(constructedTree);


            System.out.println("Sub Sequences");
            int[] sp = {1,2};
            List<Integer> list = new ArrayList<>();
            new SubSequencesOfArray().subSequence(0, sp.length, sp, list);

            String s2 = "abb";
            System.out.println(s2.isEmpty() ? 0 : (s2.equals(new StringBuilder(s2).reverse().toString()) ? 1 : 2));


            System.out.println("Tree Traversal in Spiral Form");

            TreeNode spiralTraversalNode = new TreeNode(1);
            spiralTraversalNode.left = new TreeNode(2);
            spiralTraversalNode.right = new TreeNode(3);

            spiralTraversalNode.left.left = new TreeNode(4);
            spiralTraversalNode.left.right = new TreeNode(5);

            spiralTraversalNode.left.left.left = new TreeNode(8);
            spiralTraversalNode.left.left.right = new TreeNode(9);

            spiralTraversalNode.right.left = new TreeNode(6);
            spiralTraversalNode.right.right = new TreeNode(7);

            spiralTraversalNode.right.left.left = new TreeNode(10);

            new TreeTraversalInSpiralForm().spiralTraversalMethod2(spiralTraversalNode);


            TreeNode diameter = new TreeNode(10);
            diameter.left = new TreeNode(20);
            diameter.right = new TreeNode(30);
            diameter.right.left = new TreeNode(40);
            diameter.right.right = new TreeNode(60);
            diameter.right.left.left = new TreeNode(50);
            diameter.right.right.right = new TreeNode(70);

            System.out.println();
            System.out.println("o(n2)" + new DiameterOfBinaryTree().diameter(diameter));
            System.out.println("Dia meter of binary tree" + new DiameterOfBinaryTree().diameterWithHeight(diameter));


//            System.out.println("system : " + System.getProperty("java.home"));
//
//            String directory = System.getProperty("user.home")+"/mohit";
//
//            File file = new File(directory);
//            if (!file.exists())
//                file.mkdir();
//
//            File textFile = new File(directory+"/mohit.txt");
//            if (textFile.createNewFile()){
//                System.out.println("create a file.");
//            }


            TreeNode bstRoot = new TreeNode(15);
            bstRoot.left = new TreeNode(5);
            bstRoot.left.left = new TreeNode(3);

            bstRoot.right = new TreeNode(20);
            bstRoot.right.left = new TreeNode(18);
            bstRoot.right.left.left = new TreeNode(16);

            bstRoot.right.right = new TreeNode(80);


            System.out.println("Search in binary search tree " + new SearchBST().searchBST(bstRoot, 4));

            System.out.println("floor " + (new FloorInBST().getFloor(bstRoot, 17)).data);

            TreeNode insertion = new TreeNode(10);
            insertion.left = new TreeNode(8);

            TreeNode newInserted = new InsertBST().insertBST(insertion, 12);

            System.out.println(newInserted.right.data);

            TreeSet<String> treeSet = new TreeSet<>();
            treeSet.add("Mohit");
            treeSet.add("Mobile");
            treeSet.add("Aka");
            treeSet.add("Aka");
            treeSet.add("aka");

            System.out.println(treeSet);



            Node nodeHead = new Node(-1);
            nodeHead.next = new Node(5);
            nodeHead.next.next  = new Node(3);
            nodeHead.next.next.next = new Node(4);
            nodeHead.next.next.next.next = new Node(0);

            List<Integer> numbers = new ArrayList<>();

            while (nodeHead != null) {
                numbers.add(nodeHead.data);
                nodeHead = nodeHead.next;
            }

            Collections.sort(numbers);

            System.out.println(numbers);

            Node newNodeHead = new Node(numbers.get(0));
            Node current = newNodeHead;
            for (int i = 1; i < numbers.size(); i++) {
                Node temp = new Node(numbers.get(i));
                current.next = temp;
                current = current.next;
            }

            System.out.println("new Node with sorted.");
            while (newNodeHead != null) {
                System.out.println(newNodeHead.data);
                newNodeHead = newNodeHead.next;
            }


            System.out.println("ceilingList ");
            new CeilingOnTheLeftSideOfArray().ceiling();


            System.out.println("ceilingList with Self - BST");
            new CeilingOnTheLeftSideOfArray().withBST();


            f.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    static boolean palindrome(String s, int i, int size) {
        if (s.isEmpty()) return true;
        if (i >= size) return true;
        if (s.charAt(i) != s.charAt(size - i - 1)) return false;

        return palindrome(s, i+1, size);
    }

    static void printDLL(TreeNode treeNode) {
        while (treeNode != null) {
            System.out.print(treeNode.data+" ");
            treeNode = treeNode.right;
        }
    }

    static void reverse(int[] list, int left, int n) {
        if (left >= n/2) return;
        swap(list, left, n - left - 1);
        reverse(list, left+1,n);
    }

    static void swap(int[] array, int left, int right) {
        int temp = array[right];
        array[right] = array[left];
        array[left] = temp;
    }

    static void f1(int num) {
        if (num == 0) return;
        System.out.println("Mohit");
        num--;
        f1(num);
    }

    static int n = 1;
    static void print1ToN(int num) {
        if (n == num) return;
        System.out.println(n);
        n++;
        print1ToN(num);
    }

    static void printNto1(int num) {
        if (num == 0) return;
        System.out.println(num);
        num--;
        printNto1(num);
    }

    static void DFS(TreeNode treeNode) {
        System.out.println("In Order Traversal");
        inOrderTraversal(treeNode);
        System.out.println("Pre Order Traversal");
        preOrderTraversal(treeNode);
        System.out.println("Post Order Traversal");
        postOrderTraversal(treeNode);
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

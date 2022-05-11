package com.mohit.algorithms.bit_manipulation;

import com.google.gson.Gson;
import com.mohit.data_structures.TreeNode;
import com.mohit.models.Pair;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.plaf.IconUIResource;
import java.security.*;
import java.util.*;

/*
https://www.codechef.com/problems/AMSGAME1

 */

public class BitManipulation {
    public static void main(String[] args) {

//        int[] arr1 = {2,4,2,4,7,8,8,9,9};
//        System.out.println(findUnique(arr1));
//
//        System.out.println(ithBit(10110110, 5));

        System.out.println(-1 << 1);

        System.out.println(isKthBitSet(5, 2));

        System.out.println(countSetBit(23));


        int[] nums = {3,4,3,4,8,4,4,32, 7,7};
        System.out.println(Arrays.toString(twoOddOcc(nums)));


        powerSet("abc");


        int n = 5;
        int k = 3;
        System.out.println((n & ~(1 << k - 1)));
        System.out.println((n ^ (1 << k - 1)));

        String name = "Mohit";
        int key = 32234;

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < name.length(); i++) {
            stringBuilder.append((char) (name.charAt(i) ^ key));
        }


        System.out.println("====================================");

        String binary = Integer.toBinaryString(10);


        System.out.println(countPrimeSetBits(842, 888));

        String string = "abca";
        System.out.println(string.substring(0,0) + string.substring(1,4));
        System.out.println(string.substring(0,1) + string.substring(2,4));
        System.out.println(string.substring(0,2) + string.substring(3,4));
        System.out.println(string.substring(0,3) + string.substring(4,4));

        System.out.println(Arrays.toString(palindromeString("abc")));

        System.out.println(isPalindromeExists(palindromeString("aba")));



        int[] array = {2,7,4,1,8,1};

        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int x : array) {
            heap.add(x);
        }

        while (heap.size() != 1) {
            int y = heap.poll();
            int x = heap.poll();

            if (y != x) {
                heap.add(y-x);
            }
        }
        System.out.println(heap.size() == 1 ? heap.remove() : 0);


        String s = "fhvfuiwvgdkeozslcxosbtscbvfeqpvosyaqyhscegdnqctkhawqfrrjtvpjnxeiactxogslhvwlivbksgfeshhuvhzwjqmnylkr";
        int sum= 0;
        for (int i = 0; i < s.length(); i++) {
            int asciiValue = (int) s.charAt(i);
            int alphaValue = asciiValue - 96;
            sum += alphaValue;
        }
        System.out.println(sum);


        int[] arr = {
                290267,543718,152065,36958,513757,177467,242991,350675,953587,2959,791293,804018,858084,13158,47417,736925,231101,110680,644174,327034,139929,578888,920458,773574,433483,2544,121149,455734,32135,211876,403294,178448,171656,844908,467918,757493,383815,33552,832540,652097,38529,306142,659172,313415,353482,225856,75059,416520,62819,821080,206583,686447,217176,172935,91743,49898,944080,209288,588392,143368,103781,883998,569614,805835,798227,76174,884758,406719,173453,411231,12981,805198,140596,297707,986053
        };
        int prefixSum = 0;
        for (int x : arr) {
            prefixSum += x;
        }

        int ans = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if ((prefixSum - arr[i]) % 7 == 0) {
                if (arr[i] < ans) {
                    ans = arr[i];
                    index = i;
                }
            }
        }
        System.out.println(index);



        System.out.println(isMyPrime(779));


        int[] arrElement = {2,5,6,7,8};
        System.out.println(Arrays.toString(getDeletedElement(arrElement, 2)));
        System.out.println(Math.sin(90));

        System.out.println(Math.PI * 2);
        System.out.println((360 * Math.PI) / 180);
        for (double angle = 0; angle < Math.PI * 2; angle += .01) {
            System.out.println(Math.sin(angle));
        }


//        new Solve().solve();


        System.out.println(getGCD(8, 14)); // O(min(a,b))
        System.out.println(EclideanGCD(8, 10));

//        Scanner scanner = new Scanner(System.in);
//
//        int test  = scanner.nextInt();
//
//        while(--test >= 0) {
//            int A = scanner.nextInt();
//            int B = scanner.nextInt();
//            int i = -1;
//            int j = -1;
//            int MIN = Integer.MAX_VALUE;
//            for (int fPair = A; fPair < B; fPair++) {
//                for (int sPair = fPair+1; sPair <= B; sPair++) {
//                    System.out.println(fPair  + " " + sPair);
//                    int gcdOfPairs = EclideanGCD(fPair, sPair);
//                    if (gcdOfPairs > 1) {
//                        int currentMin = fPair + sPair;
//                        if (currentMin < MIN) {
//                            MIN = currentMin;
//                            i = fPair;
//                            j = sPair;
//                        }
//                    }
//                }
//            }
//            if (i != -1 &&  j != -1) {
//                System.out.println(i+" "+j);
//            }else {
//                System.out.println(-1);
//            }
//        }

        System.out.println("answer "+ Math.ceil((double) 4 / 4));


        String number = "5";
        System.out.println(5/5);
        int lcm = 5*12/EclideanGCD(12, 5);
        System.out.println(lcm);

        mergeFunction(new int[]{1,2,3,4},  new int[]{5,6,7});

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        sortUsingRecursion(list);
        System.out.println(list);


        String people = "ab";
        System.out.println(people.substring(0,1));

        List<String> list45 = new ArrayList<>();
        printSubSet("", "abcd", list45);
        System.out.println(list45);

        System.out.println("+++=");
        System.out.println(printSubSet2("", "abcd"));

        TreeNode treeNode = new TreeNode(4);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(7);
        treeNode.left.left = new TreeNode(1);
        treeNode.right.right = new TreeNode(3);


        TreeNode result = searchBST(treeNode, 2);
       printTree(result);

       //solveTOH(1, 2, 3, 64);

        try {
            Cipher cipher = Cipher.getInstance("AES");
            String data = "https://leetcode.com/problems/design-tinyurl";

            SecretKeySpec keySpec =new SecretKeySpec(new byte[32], "AES");
            cipher.init(Cipher.ENCRYPT_MODE, keySpec);
            byte[] encrypted = cipher.doFinal(data.getBytes());
            System.out.println(new String(encrypted));
            cipher.init(Cipher.DECRYPT_MODE, keySpec);
            System.out.println(new String(cipher.doFinal(encrypted)));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (NoSuchPaddingException e) {
            throw new RuntimeException(e);
        } catch (IllegalBlockSizeException e) {
            throw new RuntimeException(e);
        } catch (BadPaddingException e) {
            throw new RuntimeException(e);
        } catch (InvalidKeyException e) {
            throw new RuntimeException(e);
        }
    }

    HashMap<String, String> encodedMap = new HashMap();
    HashMap<String, String> decodedMap = new HashMap();
    String base = "http://tinyurl.com/";

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String url = encodedMap.get(longUrl);
        if (url == null) {
            String shortUrl = base + (longUrl.length() + 1);
            encodedMap.put(longUrl, shortUrl);
            decodedMap.put(shortUrl, longUrl);
        }
        return url;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return decodedMap.get(shortUrl);
    }

    public static void solveTOH(int s, int h, int d, int n) {

        if (n == 1) {
            System.out.println("moving " + n  + " from " + s +" to " + d);
            return;
        }

        solveTOH(s, d, h, n-1);
        System.out.println("moving " + n  + " from " + s +" to " + d);

        solveTOH(h, s, d, n - 1);
    }

    public static void printTree(TreeNode node) {
        if(node != null) {
            printTree(node.left);
            System.out.println(node.data);
            printTree(node.right);
        }
    }

    public static TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.data == val) return root;
        if (val > root.data) return  searchBST(root.right, val);
        return searchBST(root.left, val);
    }

    public static void inorder(TreeNode root, int val, TreeNode node) {
        if (root != null) {
            if (root.data == val) {
                node = root;
                return;
            }else {
                if (val < root.data) {
                    inorder(root.left, val, node);
                }else {
                    inorder(root.right, val, node);
                }
            }
        }
    }

    public static void printSubSet(String unprocess, String processed, List<String> list) {
        if (processed.isEmpty()) {
            System.out.println(unprocess);
            list.add(unprocess);
            return;
        }

        printSubSet(unprocess + processed.substring(0, 1), processed.substring(1), list);
        printSubSet(unprocess, processed.substring(1), list);
    }

    public static List<String> printSubSet2(String unprocess, String processed) {
        if (processed.isEmpty()) {
            System.out.println(unprocess);
            List<String> list = new LinkedList<>();
            list.add(unprocess);
            return list;
        }

        List<String> a = printSubSet2(unprocess + processed.substring(0, 1), processed.substring(1));
        List<String> b = printSubSet2(unprocess, processed.substring(1));
        a.addAll(b);
        return a;
    }

    public static void sortUsingRecursion(List<Integer> v) {
        if (v.size() == 1) {
            return;
        }

        int temp = v.get(v.size()-1);
        v.remove(v.size()-1);
        sortUsingRecursion(v);

        insert(v, temp);
        //v.add(temp);
    }
    public static void insert(List<Integer> v, int temp) {
        if (v.size() == 0 || v.get(v.size()-1) <= temp) {
            v.add(temp);
            return;
        }

        int value = v.get(v.size()-1);
        v.remove(v.size()-1);

        insert(v, temp);
        v.add(value);
    }

    public static boolean isValidNeighbors(int x, int y, int[][] board) {
        return (x >= 0 && x < board.length && y >= 9 && y < board[0].length);
    }

    public static void gameOfLife(int[][] board) {

        int[] dx = {0,0,1,1,1,-1,-1,-1};
        int[] dy = {1,-1,1,-1,0,0,1,-1};

        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {

                int count_live_neighbors = 0;

                for (int i = 0; i < 8; i++) {
                    int curr_x = r + dx[i]; int curr_y = c + dy[i];
                    if (isValidNeighbors(curr_x, curr_y, board) && (Math.abs(board[curr_x][curr_y]) == 1)) {
                        count_live_neighbors++;
                    }
                }

                if (board[r][c] == 1 && (count_live_neighbors < 2 || count_live_neighbors > 3)) {
                    board[r][c] = -1;
                }

                if (board[r][c] == 0 && count_live_neighbors == 3) {
                    board[r][c] = 2;
                }
            }
        }

        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                if (board[r][c] >= 1) {
                    board[r][c] = 1;
                }else {
                    board[r][c] = 0;
                }
            }
        }

    }

    public static void mergeFunction(int[] a1, int[] a2) {
        int[] mergedArray = new int[a1.length + a2.length];
        int k = 0; int i = 0; int j = 0;

        while (i < a1.length && j < a2.length) {
            if (a1[i] < a2[j]) {
                System.out.println(a1[i] + " pi " + a2[j]);
                mergedArray[k] = a1[i];
                i++;
            }else {
                System.out.println(a1[i] + " pj " + a2[j]);
                mergedArray[k] = a2[j];
                j++;
            }
            k++;
        }

        while (i < a1.length) {
            mergedArray[k] = a1[i];
            i++;
            k++;
        }

        while (j < a2.length) {
            mergedArray[k] = a2[j];
            j++;
            k++;
        }

        System.out.println(Arrays.toString(mergedArray));
    }

    public static int EclideanGCD(int a, int b) {
        if (b == 0) {
            return a;
        }else {
           return EclideanGCD(b, a % b);
        }
    }

    public static int getGCD(int a, int b) {
        int res = Math.min(a, b);
        while (res != 1) {
            if (a % res == 0 && b % res == 0) {
                break;
            }
            res--;
        }
        return res;
    }

    public static int[] getDeletedElement(int[] arr, int index) {
        if (index < arr.length) {
            int[] ans = new int[arr.length-1];
            for (int i = 0; i < arr.length; i++) {
                if (index == i) continue;
                if (i > 0) {
                    ans[i - 1] = arr[i];
                }else {
                    ans[i] = arr[i];
                }
            }
            return ans;
        }
        return arr;
    }

    public static boolean isMyPrime(int n) {
        if (n == 1) return false;

        if (n == 2 || n == 3) return true;

        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i = i + 6) {
            System.out.println("i am running");
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    public static String[] palindromeString(String string) {
        String[] palindromes = new String[string.length()];
        for (int i = 0; i < string.length(); i++) {
            palindromes[i] = string.substring(0,i) + string.substring(i+1);
        }
        return palindromes;
    }

    public static boolean isPalindromeExists(String[] data) {

        boolean check = true;
        for (int i = 0; i < data.length; i++) {
            int left = 0;
            int right = data[i].length()-1;
            while(left <= right) {
                if (data[i].charAt(left) != data[i].charAt(right)) {
                    check = false;
                }else {
                    check = true;
                }
                left++;
                right--;
            }
            if (check) {
                return true;
            }else{
                continue;
            }
        }
        return check;
    }

    public static int countPrimeSetBits(int left, int right) {

        int result = 0;
        for (int i = left; i <= right; i++) {
            int n = Integer.bitCount(i);
            System.out.println("bit " + n);
            boolean isPrimeBitCount = isPrime(n);
            System.out.println("is Prime " + isPrimeBitCount);
            if (isPrimeBitCount) {
                result++;
            }
        }

        return result;
    }


    public static boolean isPrime(int n) {
        if (n == 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }


    private static int findUnique(int[] arr) {
        int unique = 0;

        for(int x : arr) {
            unique ^= x;
        }
        return unique;
    }

    private static int ithBit(int n, int bit) {
        return  n & (1 << (n-1));
    }

    private static boolean isKthBitSet(int n, int k) {
     return (n & (1 << (k-1))) != 0;
    }

    private static int countSetBit(int n) {
        int count = 0;
        while (n != 0) {
            //brian kernighan's algorithm
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    private static int[] twoOddOcc(int[] nums) {
        int xor = 0; int res1 = 0; int res2 = 0;
        for (int i = 0; i < nums.length; i++) {
            xor = xor ^ nums[i];
        }
        int lastSetBit = xor & -xor;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & lastSetBit) != 0) {
                res1 = res1 ^ nums[i];
            }else {
                res2 = res2 ^ nums[i];
            }
        }
        return new int[]{res1, res2};
    }

    private static void powerSet(String string) {
        int size = string.length();
        for (int i = 0; i < Math.pow(2, size); i++) {
            for (int j = 0; j < size; j++) {
                if ((i & (1 << j)) != 0) {
                    System.out.print(string.charAt(j));
                }
            }
            System.out.println();
        }
    }

    public static long binaryToNumber(String binaryString) {
        long number = 0;
        if (binaryString.equalsIgnoreCase("0")) return number;
        int i = 0;
        for (int index = binaryString.length() - 1; index >= 0; index--) {
            number += Long.parseLong(binaryString.charAt(index)+"") * (long) Math.pow(2, i);
            i++;
        }
        return number;
    }

    public static String numberToBinaryString(long number) {
        StringBuilder stringBuilder = new StringBuilder();
        while(number != 1) {
            stringBuilder.append(number % 2);
            number >>= 1;
        }
        stringBuilder.append("1");
        return stringBuilder.toString();
    }

    public static int singleNumber2(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i])+1);
            }else {
                map.put(nums[i], 1);
            }
        }

        int[] res = new int[2];
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                res[0] = entry.getKey();
                if (map.keySet().contains(entry.getKey()+2)) {
                    res[1] = entry.getKey() + 1;
                }else {
                    res[1] = entry.getKey() - 1;
                }
            }
        }
        return -1;
    }
}







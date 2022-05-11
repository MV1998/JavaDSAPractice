package com.mohit.algorithms.recursion;

import com.google.gson.Gson;
import com.mohit.data_structures.Node;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.util.*;

public class RecursionPractice {
    public static void main(String[] args) {
//        int sum = fibonacci(8);
//        System.out.println("nth fibonacci " + sum);



        int[] arr = {1,2,3,4,5};
        int target = 6;
        System.out.println("Search result : " + search(arr, target, 0, arr.length - 1));



        int[] newArray = {1,2,3,4,1,1,1,1};
        List<Integer> res = printArray(newArray, 0, new ArrayList<>(), 10);
        System.out.println(new Gson().toJson(res));

        print(3);

        System.out.println(fact(5));
        System.out.println(digitSum(1342));


        rev1(123);
        System.out.println(sum);
        int n = 1101;
        int digits = (int)(Math.log10(n))+ 1;
        System.out.println(rev2(n, digits-1));
        System.out.println(palindrome(123));
        int count = 0;
        System.out.println(countZeros(1200110101, count));


        String number = "1111110011101010110011100100101110010100101110111010111110110010";
//        long cnvtedNumber = Long.parseLong(number);
//        int digit = (int) Math.log10(cnvtedNumber) + 1;
        System.out.println("==========");
//        System.out.println(digit);
//        System.out.println(getDecimal(number, 0, number.length()-1));
//        System.out.println(countSteps(getDecimal(number, 0, number.length()-1), 0));


        int[] sortCheck = {1,2,3,8,4,9};
        System.out.println("is sorted " + isArraySorted(sortCheck, 0));

        System.out.println("linear search " + searchLinearly(sortCheck, 8, 0));


        int[] find = {1,2,34,5,6,5,6,5,5,5};
//        System.out.println("same elements " + new Gson().toJson(findAllIndexes(find, 5, 0, new ArrayList<>())));
        System.out.println("without arguments " + findAllIndexesWithArguments(find, 5, 0));




        triangle(4,0);


        System.out.println();
        int[] arrayToBeSort = {2,5,1,4,3};
//        bubbleSort(arrayToBeSort, arrayToBeSort.length-1, 0);
//        System.out.println(Arrays.toString(arrayToBeSort));


        System.out.println();

//        selectionSort(arrayToBeSort, arrayToBeSort.length, 0, 0);
//        System.out.println(Arrays.toString(arrayToBeSort));
//
//
//        Node node = new Node(10);
//        node.next = new Node(20);
//        node.next.next = new Node(30);
//        node.next.next.next = new Node(40);
//        node.next.next.next.next = new Node(60);
//
//        System.out.println(printList(node, 0));
//
//        int size = 126;
//        int remender = size % 25;
//        System.out.println(remender);
//        int run = remender == 0 ? size / 25 : (size / 25) + 1;
//        System.out.println(run);
//

        quickSort(arrayToBeSort, 0, arrayToBeSort.length - 1);
        System.out.println(Arrays.toString(arrayToBeSort));

        int nums1[] = {};
        int nums2[] = {1};
        int m = 0;
        int nn = 1;

//        int[] arrLog = {1,3,2,4,5};
//        int[] resLog = mergeSort(arrLog, 0, arr.length);
//        System.out.println(Arrays.toString(resLog));


        String stringToBeFiltered = "baccab";
        System.out.println("filter screen " + getFilterString(stringToBeFiltered, 0,
                stringToBeFiltered.length(), new StringBuilder()));

        System.out.println("filter screen " + getFilter(stringToBeFiltered, 0,
                stringToBeFiltered.length()));


        System.out.println("subset ");
        subSeq("", "abc");
        System.out.println(new Gson().toJson(subSeqWithReturn("", "abc")));


        System.out.println(Math.sqrt(19));


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        getSubSetsRec(list, new ArrayList<>(), 0);
        System.out.println("sub sets with result " + getSubSetsRecList(list, new ArrayList<>(), 0));

        System.out.println("iterative solution : " + subSets(new int[]{1,2,2}));

        String mohit = "ab";
        System.out.println(mohit.substring(0,2));


        permutation("", "abc");
        System.out.println(permutationList("","abc"));
        System.out.println(permutationCount("","abcdefgh"));


        System.out.println((char)('a'+ 1));
        System.out.println('2'-'0');
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j < 6; j++) {
                char first = (char) ('a' + i);
                char second = (char) ('a' + j);
                System.out.print(" "+first+second);
            }
            System.out.println();
        }


        System.out.println("power of three "+ powerOfThree(8));

        int[] candidates = {2,3,5};
        List<Integer> comSum = new ArrayList<>();
        System.out.println(combinationSub(candidates, 8, 0, comSum));



        combinationSubRecur(0, 8, list, candidates);

        int[] range = {1,2,3};
        System.out.println(Arrays.toString(Arrays.copyOfRange(range, 3, range.length)));





        int[] pushed = {2,0,1};
        int[] popped = {2,1,0};

        System.out.println(isValidStackSequences(pushed, popped));





        List<Integer> listResult = new ArrayList<>();
        HashMap<Integer, Integer> hm1 = new HashMap<>();
        HashMap<Integer, Integer> hm2 = new HashMap<>();

        int[] arr1 = {1,2,2,2,3,4};
        int[] arr2 = {2,2,3,5};
        for (int i = 0 ; i < arr1.length; i++) {
            if (hm1.containsKey(arr1[i])) {
                hm1.put(arr1[i], hm1.get(arr1[i]) + 1);
            }else {
                hm1.put(arr1[i], 1);
            }
        }

        for (int i = 0 ; i < arr2.length; i++) {
            if (hm2.containsKey(arr2[i])) {
                hm2.put(arr2[i], hm2.get(arr2[i]) + 1);
            }else {
                hm2.put(arr2[i], 1);
            }
        }

        for (Integer key : hm1.keySet()) {
            if (hm2.containsKey(key)) {
                int x = Math.max(hm1.get(key), hm2.get(key));
                while(x-- > 0) {
                    list.add(key);
                }
            }
        }


        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }














    }


    public static boolean isValidStackSequences(int[] pushed, int[] popped) {
            Stack<Integer> popStack = new Stack<Integer>();
            Stack<Integer> validStack = new Stack<Integer>();

        for(int i = popped.length - 1  ; i >= 0 ; i--) {
            popStack.push(popped[i]);
        }

        for(int i = 0; i < popStack.peek(); i++) {
            validStack.push(pushed[i]);
        }

            while(!validStack.isEmpty()) {
                if (validStack.contains(popStack.peek()) && validStack.peek() == popStack.peek()) {
                    validStack.pop();
                    popStack.pop();
                }else if (!validStack.contains(popStack.peek())) {
                    validStack.push(popStack.pop());
                    validStack.pop();
                }else {
                    return false;
                }
            }
            return true;
    }


    public static boolean printList(Node node, int target) {
        if (node == null) return false;

        if (node.data == target) return true;
        return printList(node.next, target);
    }


    public static int fibonacci(int n) {
        if (n < 2) {
            return n;
        }
        int res = fibonacci(n - 1) +  fibonacci(n - 2);
        return res;
    }

    public static int search(int[] arr, int target, int s, int e) {
        if (s > e) return -1;

        int mid = s + (e - s)/2;

        if (target == arr[mid]) return mid;

        if (target < arr[mid]) return search(arr, target, s, mid - 1);
        else return search(arr, target, mid + 1, e);
    }

    public static List<Integer> printArray(int[] arr, int index, List<Integer> res, int target) {
        if (index == arr.length) return res;

        if (arr[index] == target) {
            res.add(target);
        }

        return printArray(arr, index+1, res, target);
    }

    public static void print(int n) {
        if (n <= 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(--n);
    }

    public static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return n + fact(n -1);
    }

    public static int digitSum(int n) {
        if (n%10 == n) {
            return n;
           }
        return n % 10 * digitSum(n / 10);
    }

    static int sum = 0;
    public static void rev1(int n) {
        if (n == 0) return;

        int rem = n % 10;
        sum = sum * 10 + rem;
        rev1(n / 10);
    }

    public static int rev2(int n, int base) {
        if (n == 0) return 0;

        return (int) ((n % 10 * Math.pow(10, base)) + rev2(n / 10, base - 1));
    }

    public static boolean palindrome(int n) {
        return n == rev2(n, 3-1);
    }

//    public static int countZeros(int n) {
//        if (n == 0) return 0;
//
//        if (n % 10 == 0) {
//            return 1 + countZeros(n / 10);
//        }
//        return countZeros(n / 10);
//    }

    public static int countZeros(int n, int count) {
        if (n == 0) return count;

        if (n % 10 == 0) {
           return countZeros(n / 10, count+1);
        }
       return countZeros(n / 10, count);
    }

//    public static long getDecimal(String number, int base, int index) {
//        if (index == -1) return 0;
//
//        return (long) ((Long.parseLong(String.valueOf(number.charAt(index)))) * Math.pow(2, base)) + getDecimal(number, base+1, index-1);
//    }
//
//    public static int countSteps(long num, int steps) {
//        if (num == 1) return steps;
//
//        if (num % 2 == 0) {
//            return countSteps(num / 2, steps + 1);
//        }
//        return countSteps(num + 1, steps + 1);
//    }

    public static boolean isArraySorted(int[] arr, int index) {
        if (arr.length - 1 == index) {
            return true;
        }
        if (arr[index] <= arr[index+1]) {
            return isArraySorted(arr, index+1);
        }
        return false;
    }

    public static int searchLinearly(int[] arr, int target, int index) {

        if (arr[index] == target) return index;

        if (arr.length == index) return -1;

        return searchLinearly(arr, target, index+1);
    }

    public static List<Integer> findAllIndexes(int[] arr, int target, int index, List<Integer> list) {
        if (arr.length == index) return list;

        if (arr[index] == target) {
            list.add(index);
        }

        return findAllIndexes(arr, target, index+1, list);
    }

    public static List<Integer> findAllIndexesWithArguments(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (arr.length == index) return list;

        if (arr[index] == target) {
            list.add(index);
        }

        List<Integer> fromElements = findAllIndexesWithArguments(arr, target, index+1);
        list.addAll(fromElements);
        return list;
    }


    public static void triangle(int r, int c) {
        if (r == 0) return;

        if (c < r) {
            triangle(r, c+1);
            System.out.print("M");
        }else{
            triangle(r-1, 0);
            System.out.println();
        }
    }


    public static void bubbleSort(int[] arr, int r, int c) {
        if (r == 0) return;

        if (c < r) {
            if (arr[c] > arr[c+1]) {
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
                bubbleSort(arr, r, c+1);
            }else{
                bubbleSort(arr, r, c+1);
            }
        }else {
            bubbleSort(arr, r-1, 0);
        }
    }

    public static void selectionSort(int[] arr, int r, int c, int max) {
        if (r == 0) return;

        if (c < r) {
            if (arr[c] > arr[max]) {
                selectionSort(arr, r, c+1, c);
            }else {
                selectionSort(arr, r, c+1, max);
            }
        }else{
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selectionSort(arr, r-1, 0, 0);
        }
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low >= high) return;

        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = arr[m];

        while( s <= e) {
            while (arr[s] < pivot) {
                s++;
            }

            while (arr[e] > pivot) {
                e--;
            }

            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        quickSort(arr, low, e);
        quickSort(arr, s, high);
    }



    public static int[] mergeSort(int[] arr, int s, int e) {
        if (arr.length == 1) return arr;

        int mid = s + (e - s) / 2;
        int[] first = mergeSort(Arrays.copyOfRange(arr, s, mid), s, mid);
        int[] second = mergeSort(Arrays.copyOfRange(arr, mid+1, e), mid+1, e);


        return merge(first, second);
    }

    public static int[] merge(int[] first, int[] second) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] karr = new int[first.length + second.length];

        while(i < first.length && j < second.length) {
            if (first[i] <= second[j]) {
                karr[k] = first[i];
                i++;
            }else{
                karr[k] = second[j];
                j++;
            }
            k++;
        }


        while(i < first.length) {
            karr[k] = first[i];
            i++;
            k++;
        }

        while(j < second.length) {
            karr[k] = second[j];
            j++;
            k++;
        }

        return karr;
    }

    public static String getFilterString(String string, int start, int size, StringBuilder sb) {
        if (start == size) return sb.toString();

        if (string.charAt(start) != 'a') {
            sb.append(string.charAt(start));
        }
        return getFilterString(string, start+1, size, sb);
    }

    public static String getFilter(String string, int start, int size) {
        if (start == size) return "";

        if (string.charAt(start) != 'a') {
            return string.charAt(start) + getFilter(string, start+1, size);
        }
        return getFilter(string, start+1, size);
    }

    public static void subSeq(String processed, String unProcessed) {
        if (unProcessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        char ch = unProcessed.charAt(0);

        subSeq(processed, unProcessed.substring(1));
        subSeq(processed+ch, unProcessed.substring(1));
        subSeq(processed+(ch+0), unProcessed.substring(1));
    }

    public static List<String> subSeqWithReturn(String processed, String unProcessed) {
        if (unProcessed.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        char ch = unProcessed.charAt(0);

        List<String> left = subSeqWithReturn(processed, unProcessed.substring(1));
        List<String> right =  subSeqWithReturn(processed+ch, unProcessed.substring(1));
        left.addAll(right);
        return left;
    }

    public static List<List<Integer>> subSets(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
         list.add(new ArrayList<>());

         int start = 0;
         int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = 0;
            if (i > 0 && arr[i] == arr[i-1]) {
                start = end + 1;
            }
            end = list.size() - 1;
            int n = list.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(list.get(j));
                if (true) {
                    internal.add(arr[i]);
                    list.add(internal);
                }
            }
        }

        return list;
    }

    public static void getSubSetsRec(List<Integer> unProcessList, List<Integer> processed, int index) {

        if (index == unProcessList.size()) {
            System.out.println(processed);
            return ;
        }

        processed.add(unProcessList.get(index));
        getSubSetsRec(unProcessList, processed, ++index);

        processed.remove(processed.size()-1);
        getSubSetsRec(unProcessList, processed, index);
    }

    public static List<List<Integer>> getSubSetsRecList(List<Integer> unProcessList, List<Integer> processed, int index) {

        if (index == unProcessList.size()) {
            List<List<Integer>> list = new ArrayList<>();
            list.add(processed);
            int sum = 0;
             for (int x : processed) {
                 sum += x;
             }
             if (sum == 4) {
                 System.out.println(processed);
             }
            return list;
        }

        List<List<Integer>> res = new ArrayList<>();

        processed.add(unProcessList.get(index));
        res.addAll(getSubSetsRecList(unProcessList, processed, ++index));

        processed.remove(processed.size()-1);
        res.addAll(getSubSetsRecList(unProcessList, processed, index));
        return res;
    }

    public static void permutation(String processed, String upProcessed) {
        if (upProcessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        char ch = upProcessed.charAt(0);

        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0, i);
            String second = processed.substring(i, processed.length());
            permutation(first + ch + second, upProcessed.substring(1));
        }
    }

    public static List<String> permutationList(String processed, String upProcessed) {
        if (upProcessed.isEmpty()) {
            List<String> list = new ArrayList<>();
            System.out.println(processed);
            list.add(processed);
            return list;
        }

        List<String> result = new ArrayList<>();

        char ch = upProcessed.charAt(0);

        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0, i);
            String second = processed.substring(i, processed.length());
            result.addAll(permutationList(first + ch + second, upProcessed.substring(1)));
        }
        return result;
    }

    public static int permutationCount(String processed, String upProcessed) {
        if (upProcessed.isEmpty()) {
            return 1;
        }


        int count = 0;
        char ch = upProcessed.charAt(0);

        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0, i);
            String second = processed.substring(i, processed.length());
            count = count + permutationCount(first + ch + second, upProcessed.substring(1));
        }
        return count;
    }


    public static boolean powerOfThree(int n) {
        if (n < 0) return false;

        while(n != 1) {
            int rem = n % 3;
            if (rem != 0) return false;
            n = n / 3;
        }
        return true;
    }

    public static List<List<Integer>> combinationSub(int[] nums, int target, int sum, List<Integer> processed) {
        if (target == 0) {
            List<List<Integer>> list = new ArrayList<>();
            list.add(new ArrayList<>(processed));
            return list;
        }

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (target - nums[i] > -1) {
                processed.add(nums[i]);
                list.addAll(combinationSub(nums, target - nums[i], sum + nums[i], processed));
                processed.remove(processed.size()-1);
            }
        }
        return list;
    }

    public static void combinationSubRecur(int index, int target, List<Integer> list, int[] nums) {
       if (index == nums.length) {
           if (target == 0) {
               System.out.println(list);
           }
           return;
       }

        if (nums[index] <= target) {
            list.add(nums[index]);
            combinationSubRecur(index, target - nums[index], list, nums);
            list.remove(list.size() - 1);
        }
        combinationSubRecur(index + 1, target, list, nums);
    }


    public static void combination(int[] arr,int target, int index) {
        if (arr.length == 0) {
            if (target == 0) {
                System.out.println(1);
            }
            return;
        }

        combination(Arrays.copyOfRange(arr, index+1, arr.length), target, index++);
    }
}

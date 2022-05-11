package com.mohit.algorithms;

import com.mohit.algorithms.sortings.MergeSort;
import com.mohit.models.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] arr = {8,2,1,3,5,6};
        int left = 0;
        int right = arr.length - 1;
        MergeSort mergeSort = new MergeSort();


        List<Pair> v = new ArrayList<>(arr.length);
        for (int i = 0; i < arr.length; i++) {
            Pair pair = new Pair(arr[i], i);
            v.add(pair);
        }
        for(Pair p : v) {
            System.out.println(p.getVal() + " " + p.getIndex());
        }

        int[] count = new int[arr.length];

        mergeSort.mergeSort(count, v, left, right);
        for (int x : count) {
            System.out.print(x + " ");
        }
    }
}

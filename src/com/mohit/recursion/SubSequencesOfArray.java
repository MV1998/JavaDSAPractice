package com.mohit.recursion;

import java.util.List;

public class SubSequencesOfArray {
    public void subSequence(int ind, int n, int[] arr, List<Integer> list) {
        if (ind == n) {
            System.out.println(list);
            return;
        }

        list.add(arr[ind]);

        // take or pick
        subSequence(ind+1, n, arr, list);

        list.remove(list.size()-1);

        // not take or not pick
        subSequence(ind+1, n, arr, list);
    }
}

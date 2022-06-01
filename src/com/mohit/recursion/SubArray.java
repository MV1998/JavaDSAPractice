package com.mohit.recursion;

import java.util.ArrayList;
import java.util.List;

public class SubArray {
        int result = 0;
        public void generateSumArray(int[] arr, int start, int end) {
            if (end == arr.length) {
                return;
            }else if (start > end) {
                generateSumArray(arr, 0, end+1);
            }else {
                List<Integer> list = new ArrayList<>();
                for (int i = start; i < end; i++) {
                    list.add(arr[i]);
                }
                list.add(arr[end]);
                int sum = 0;
                for (int x : list) {
                    sum += x;
                }
                if ((sum & 1) != 0) {
                    result += 1;
                }
                generateSumArray(arr, start+1, end);
            }
        }
}

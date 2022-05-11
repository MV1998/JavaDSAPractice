package com.mohit.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class RemoveCoveredElements {
    public int getCount(int [][] intervals) {
        int res = 0;
        int left = -1, right = -1;
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        for (int[] v : intervals) {
            if (left < v[0] &&  v[1] > right) {
                left = v[0];
                ++res;
            }
            right = Math.max(right, v[1]);
        }
        return res;
    }
}

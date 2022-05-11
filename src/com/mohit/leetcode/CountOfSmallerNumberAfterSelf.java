package com.mohit.leetcode;

import java.util.*;

public class CountOfSmallerNumberAfterSelf {
    public void count() {
        int[] nums = {5,2,6,1};
//        List<Integer> counts = new ArrayList<Integer>();
//        for (int i = 0; i < nums.length; i++) {
//            int count = 0;
//            List<Integer> sorted = new ArrayList<Integer>();
//            for (int k = i ; k < nums.length; k++) {
//                sorted.add(nums[k]);
//            }
//            Collections.sort(sorted);
//            for (int j : sorted) {
//                if (j < nums[i]) {
//                    ++count;
//                }else {
//                    break;
//                }
//            }
//            counts.add(count);
//        }

        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < nums.length;i++) {
            treeSet.add(nums[i]);
        }
        List<Integer> counts = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            SortedSet set = treeSet.subSet(-9999, nums[i]);
            counts.add(set.size());
        }
        System.out.println(counts);
    }
}

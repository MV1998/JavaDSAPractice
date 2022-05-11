package com.mohit.tree_questions.binary_search_tree;

import java.util.*;

public class CeilingOnTheLeftSideOfArray {

    public void ceiling() {
        int[] array = {2, 8, 30, 15, 25, 12};
        List<Integer> ceilListForLeftSide = new ArrayList<>();
        ceilListForLeftSide.add(-1);
        // left side
        for (int i = 1; i < array.length; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (array[j] > array[i]) {
                    list.add(array[j]);
                }
            }
            if (!list.isEmpty()) {
                Collections.sort(list);
                ceilListForLeftSide.add(list.get(0));
            }else {
                ceilListForLeftSide.add(-1);
            }
        }

        for (int x : ceilListForLeftSide) {
            System.out.println("ceil is left" + x);
        }


        System.out.println("Ceil on right side ");

        List<Integer> ceilListForRightSide = new ArrayList<>();
        for (int i = 0; i < array.length-1; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = i; j < array.length; j++) {
                if (array[j] > array[i]) {
                    list.add(array[j]);
                }
            }
            if (!list.isEmpty()) {
                Collections.sort(list);
                ceilListForRightSide.add(list.get(0));
            }else {
                ceilListForRightSide.add(-1);
            }
        }
        ceilListForRightSide.add(-1);

        for (int x : ceilListForRightSide) {
            System.out.println("ceil is right " + x);
        }

    }

    public void withBST() {
        int[] array = {10, 5, 11, 10, 20, 12};
        TreeSet<Integer> s = new TreeSet<>();
        s.add(array[0]);
        System.out.println(-1);
        for (int i = 1; i < array.length; i++) {
            if (s.ceiling(array[i]) != null ) {
                System.out.println(s.ceiling(array[i]));
            }else {
                System.out.println(-1);
            }
            s.add(array[i]);
        }

        TreeSet right = new TreeSet();

//        System.out.println("right side ");
//        int i = 0;
//        while (!right.isEmpty()) {
//            right.remove(array[i]);
//            if (right.ceiling(array[i]) != null)  {
//                System.out.println(right.ceiling(array[i]));
//            }else {
//                System.out.println(-1);
//            }
//            ++i;
//        }


        for (int i = array.length - 1; i >= 0; i--) {
            Integer integer = (Integer) right.ceiling(array[i]);
            if (integer == null) {
                System.out.println(-1);
            }else {
                System.out.println(integer);
            }
            right.add(array[i]);
        }

    }
}

package com.mohit.leetcode;

public class TransitionPoint {
    public int getPoint() {
        int[] arr = {0,1,1};
//        for (int i = 0; i < arr.length;i++) {
//            System.out.println("running");
//            if (arr[i] == 1) {
//                return i;
//            }
//        }

        if (arr.length == 1 && arr[0] == 1) return 1;
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            System.out.println("mid checking " + mid);
            if (arr[mid] == 1) {
                if (mid - 1 > -1 && arr[mid - 1] == 0) {
                    return mid;
                }else {
                    right = mid - 1;
                }
            }else {
                left = mid + 1;
            }
        }
        return -1;
    }
}

package com.mohit.algorithms.sortings;

import com.mohit.models.Pair;

import java.util.HashMap;
import java.util.List;

public class MergeSort {

//    public void merge(int[] arr, int left, int mid, int right) {
//        int n1 = mid - left + 1;
//        int n2 = right - mid;
//        int[] arr1 = new int[n1];
//        int[] arr2 = new int[n2];
//
//
//        for (int i = 0; i < n1; i++) {
//            arr1[i] = arr[left + i];
//        }
//
//        for (int i = 0; i < n2; i++) {
//            arr2[i] = arr[i + mid + 1];
//        }
//
//        int i = 0, j = 0, k = left;
//
//        while (i < n1 && j < n2) {
//            if (arr1[i] <= arr2[j]) {
//                arr[k++] = arr1[i++];
//            }else {
//                arr[k++] = arr2[j++];
//            }
//        }
//
//        while (i < n1) {
//            arr[k++] = arr1[i++];
//        }
//
//        while (j < n2) {
//            arr[k++] = arr2[j++];
//        }
//    }

    public void merge(int[] count, List<Pair> v, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        int[] newArray = new int[v.size()];

        for (int i = 0; i < n1; i++) {
            arr1[i] = v.get(i).getVal();
        }

        for (int i = 0; i < n2; i++) {
            arr2[i] = v.get(i).getVal();
        }

        for (int x : arr1) {
            System.out.print(" ==> " + x);
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                newArray[k++] = arr1[i++];
            }else {
                count[v.get(i).getIndex()] += right - j + 1;
                newArray[k++] = arr2[j++];
            }
        }

        while (i < n1) {
            newArray[k++] = arr1[i++];
        }

        while (j < n2) {
            newArray[k++] = arr2[j++];
        }
    }

    public void mergeSort(int[] count, List<Pair> v, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(count, v, left, mid);
            mergeSort(count, v, mid + 1, right);
            merge(count, v, left, mid, right);
        }
    }

//    public void mergeSort(int[] arr, int left, int right) {
//        if (left < right) {
//            int mid = left + (right - left) / 2;
//            mergeSort(arr, left, mid);
//            mergeSort(arr, mid + 1, right);
//            merge(arr, left, mid, right);
//        }
//    }

}

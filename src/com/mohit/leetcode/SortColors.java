package com.mohit.leetcode;

public class SortColors {
    public void sort() {
        int[] colors = {2,0,2,1,1,0};
        for (int i = 0; i < colors.length;i++) {
            for (int j = i; j < colors.length;j++) {
                if (colors[j] < colors[i]) {
                    int temp = colors[j];
                    colors[j] = colors[i];
                    colors[i] = temp;
                }
            }
        }

        System.out.println("sorted colors");
        for (int x : colors) {
            System.out.print(x+" ");
        }
    }
}

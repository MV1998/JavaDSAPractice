package com.mohit.leetcode;

import java.io.IOException;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        String s = "MOHIT";
        int rows = 3;

        System.out.println(zigZagConversion(s, rows));
    }

    static String zigZagConversion(String s, int rows) {
        if (rows == 1) return s;

        StringBuilder stringBuilder = new StringBuilder();
        int n = s.length();
        int increment = 2 * rows - 2;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j + i < n; j = j + increment) {
                stringBuilder.append(s.charAt(i + j));
                if (i != 0 && i != rows-1 && j + increment - i < n) {
                    stringBuilder.append(s.charAt(j + increment - i));
                }
            }
        }
        return stringBuilder.toString();
    }
}

package com.mohit.leetcode;

public class ExcelSheetColumnNumber {
    int getColumnNumber(String columnTitle) {

        int number = 0;
        for (char c : columnTitle.toCharArray()) {
            number = number * 26 + (c - 'A' + 1);
        }

        return number;
    }

}

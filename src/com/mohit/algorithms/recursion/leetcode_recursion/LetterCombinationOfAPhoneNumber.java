package com.mohit.algorithms.recursion.leetcode_recursion;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationOfAPhoneNumber {
    public static void main(String[] args) {
        letterCom("", "23");
        System.out.println(letterComList("","23"));
        System.out.println(Character.getNumericValue('2'));



        dice("", 2);
        System.out.println(diceCounts("",6));
    }
    
    public static void letterCom(String processed, String unProcessed) {
        if (unProcessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        
        int digit = unProcessed.charAt(0) - '0';
        
        for (int i = (digit-1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            letterCom(processed + ch, unProcessed.substring(1));
        }
     }

    public static List<String> letterComList(String processed, String unProcessed) {
        if (unProcessed.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        List<String> list = new ArrayList<>();
        int digit = unProcessed.charAt(0) - '0' - 1;

        int start = 0;
        int end = 0;
        if (digit < 6) {
            start = (digit - 1) * 3;
            end = digit * 3;
        }else if (digit == 6) {
            start = (digit - 1) * 3;
            end = (digit * 3) + 1;
        }else if (digit == 7) {
            start = ((digit - 1) * 3) + 1;
            end = (digit * 3) + 1;
        }else {
            start = ((digit - 1) * 3) + 1;
            end = (digit * 3) + 2;
        }

        for (int i = start; i < end; i++) {
            char ch = (char) ('a' + i);
            list.addAll(letterComList(processed + ch, unProcessed.substring(1)));
        }
        return list;
    }

    public static void dice(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p+i, target-i);
        }
    }

    public static int diceCounts(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return 1;
        }
        int count = 0;
        for (int i = 1; i <= 6 && i <= target; i++) {
            count = count + diceCounts(p+i, target-i);
        }
        return count;
    }
}

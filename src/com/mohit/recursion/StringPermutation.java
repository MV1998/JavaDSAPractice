package com.mohit.recursion;

public class StringPermutation {
    public void permutation(String s, int i) {
        if (i == s.length() - 1) {
            System.out.println(s);
            return;
        }

        for (int j = i; j < s.length(); j++) {
            s = swap(s, j, i);
            permutation(s, i+1);
            s = swap(s, i, j);
        }
    }

    public String swap(String str, int i, int j) {
        char temp;
        char[] chars = str.toCharArray();
        temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return String.valueOf(chars);
    }
}

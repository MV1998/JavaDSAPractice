package com.mohit.leetcode;

public class DivideTwoIntegers {
    public static void main(String[] args) {
        System.out.println(divide(0, 1));
        System.out.println(3 >> 3);
    }

    public static int divide(int dividend, int divisor) {
        if (dividend == 0) return 0;
        int quotient = (dividend >> (Math.abs(divisor)-1)) + 1;
        if (quotient > (Math.pow(2, 31) - 1)) {
            return (int) (Math.pow(2, 31) - 1);
        }
        if (quotient < (-Math.pow(2, 31))) {
            return (int) -(Math.pow(2, 31));
        }
        if (dividend < 0 || divisor < 0) {
            return -(quotient);
        }
        return quotient;
    }
}

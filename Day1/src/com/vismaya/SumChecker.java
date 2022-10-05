package com.vismaya;

public class SumChecker {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(23456));
    }

    public static int sumDigits(int number) {
        int count = 0;
        int sum = 0;
        if (number < 10) {
            return -1;
        }
        while (number != 0) {
            int rem = number % 10;
            sum += rem;
            number /= 10;
            count++;
        }
        return sum;
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int rev = 0;
        int count = 0;
        while (number != 0) {
            int rem = number % 10;
            if (rem % 2 == 0) {
                rev += rem;
                return rev;
            }
            number /= 10;
            count++;
        }
        return rev;
    }
}


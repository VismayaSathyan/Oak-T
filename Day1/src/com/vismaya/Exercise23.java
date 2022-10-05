package com.vismaya;

public class Exercise23 {
    public static void main(String[] args) {
        numbersToWords(1234);
    }

    public static void numbersToWords(int number) {
        int count = getDigitCount(number);
        number = reverse(number);
        if (number < 0) {
            System.out.println("Invalid Operator");
        } else {
            for (int i = 0; i < count; i++) {
                int rem = number % 10;
                switch (rem) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    default:
                        System.out.println("Nine");
                        break;
                }
                number /= 10;
            }
        }


    }

    public static int reverse(int number) {
        if (number < 0) {
            return -1;
        }
        int rev = 0;
        while (number != 0) {
            int rem = number % 10;
            rev = rev * 10 + rem;
            number /= 10;
        }
        return rev;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int count = 0;
        do {
            number /= 10;
            count++;
        }
        while (number > 0);
        return count;
    }
}
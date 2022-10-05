package com.vismaya;

import java.util.Scanner;

public class GCD_HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1: ");
        int number1 = sc.nextInt();
        System.out.println("Enter the number2: ");
        int number2 = sc.nextInt();
        int result = getGreatestCommonDivisor(number1,number2);
        System.out.println(result);
    }
    public static int getGreatestCommonDivisor(int a, int b){
        int result = 0;
        if(a<10 || b<10){
            return -1;
        }
        else{
            result = Math.min(a,b);
            while(result>0){
                if(a % result == 0 && b % result == 0){
                    break;
                }
                result--;
            }
            return result;
        }
    }
}

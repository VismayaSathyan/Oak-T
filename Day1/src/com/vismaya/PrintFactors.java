package com.vismaya;

import java.util.Scanner;

public class PrintFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        printFactors(number);
    }
    public static void printFactors(int number){
        if(number<1){
            System.out.println("Invalid Value");
        }

        for(int i=1; i<=number; i++){

            if((number % i) == 0){
                System.out.println(i);
            }
        }
    }
}

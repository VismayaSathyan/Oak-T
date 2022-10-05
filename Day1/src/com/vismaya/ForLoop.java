package com.vismaya;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        //int n =1000;
        int count = 0;
        int sum = 0;
        for(int i=1; i<=1000; i++){
            if((i % 3==0) && (i % 5 == 0)){
                sum += i;
                System.out.println("sum num: " + i + " " + sum);
                count ++;
                System.out.println(count);
            }
            if(count == 5){
                System.out.println("Exiting...");
                break;
            }
        }


//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter a number: ");
//        int n = sc.nextInt();
//        for(int i = 0; i<=n; i++){
//        System.out.println("Amount: ");
//        double amnt = sc.nextDouble();
//        System.out.println("Rate: ");
//        double rate = sc.nextDouble();
//            System.out.println("Simple interest is: "+ interest(amnt, rate));
        }
    }
//    static double interest(double amnt, double interestRate){
//        return amnt * (interestRate/100);
//    }


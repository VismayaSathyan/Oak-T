package com.vismaya;

import java.util.Scanner;

public class ReadUserInput {
    public static void main(String[] args) {
        int sum = 0;
        int avg = 0;
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number: ");
        boolean hasNext = sc.hasNextInt();
        if(hasNext){
            int num1 = sc.nextInt();
            for(int i=1; i<=num1; i++){
                int num = sc.nextInt();
                sum += num;
            }
            avg = sum/num1;

            System.out.print("SUM = "+sum+" AVG = "+avg);
        }
        else{
            System.out.print("SUM = "+sum+" AVG = "+avg);
        }
//        int sumNum = 0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the count: ");
//        boolean hasInt = sc.hasNextInt();
//        if(hasInt) {
//            int count = sc.nextInt();
//            if(count>0) {
//                int i = 1;
//            while (i<= count){
//                int order = i;
//                System.out.println("enter the sum numbers "+ order+ ": ");
//                   int sum = sc.nextInt();
//                   sumNum += sum;
//                     i++;
//            }
////                for (int i = 1; i <= count; i++) {
////                    System.out.println("enter the sum numbers: ");
////                    int sum = sc.nextInt();
////                    sumNum += sum;
////                }
//             System.out.println("sum is: " + sumNum);
//           }
//            else{
//                System.out.println("negative numbers are not allowed.");
//            }
//        }
//        else {
//            System.out.println("Not a number");
//        }
    }
}

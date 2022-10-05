package com.vismaya;

import java.util.Scanner;

public class ControlStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a letter : ");
//        char letter = sc.next().charAt(0);
//        switch (letter){
//            case 'A':
//                System.out.println("It is A");
//                break;
//            case 'B':
//                System.out.println("It is B");
//                break;
//            case 'C':
//                System.out.println("It is C");
//                break;
//            case 'D':
//                System.out.println("It is D");
//                break;
//            case 'E':
//                System.out.println("It is E");
//                break;
//            default:
//                System.out.println("Not found!"); break;
//        }

        System.out.print("Enter a month : ");
         String months = sc.nextLine();
        switch (months){
            case "Jan":
                System.out.println("It is A");
                break;
            case "Feb":
                System.out.println("It is B");
                break;
            case "Mar":
                System.out.println("It is C");
                break;
            case "Apr":
                System.out.println("It is D");
                break;
            case "May":
                System.out.println("It is E");
                break;
            default:
                System.out.println(months + " Not found!"); break;
        }
    }
}

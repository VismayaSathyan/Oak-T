package com.vismaya;

public class MethodOverloading {
    public static void main(String[] args) {
        calFeetandInchesToCenti(3, 5);
        calFeetandInchesToCenti(157);
    }
    static double calFeetandInchesToCenti(double feet, double inches) {

        if ((feet < 0) || (inches < 0) || (inches > 12)) {
            return -1;
        }

        double feetToCentimeter = feet * 30.48;
        double inchToCenti = inches * 2.54;
        double centi = feetToCentimeter + inchToCenti;
        System.out.println(feet +" feet "+ inches + "inches = " +centi+ " centimeter");
        return centi;
    }
    static double calFeetandInchesToCenti(double inches){

        if(inches<0){
            return -1;
        }
        double feet = (int) inches /12;
        double remInches = (int) inches % 12;
        System.out.println(inches +" inches = " +feet+ " feet " +remInches + " inches");
        return calFeetandInchesToCenti(feet, remInches);
        }
    }


//public class MethodOverloading {
//
//    public static void main(String[] args) {
//
//        double centimeters = calcFeetAndInchesToCentimeters(7,0);
//        if(centimeters <0.0) {
//            System.out.println("Invalid parameters");
//        }
//
//        calcFeetAndInchesToCentimeters(157);
//    }
//
//    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
//
//        if((feet <0) || ((inches <0) || (inches >12))) {
//            System.out.println("Invalid feet or inches parameters");
//            return -1;
//        }
//
//        double centimeters = (feet * 12) * 2.54;
//        centimeters += inches * 2.54;
//        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
//        return centimeters;
//    }
//
//    public static double calcFeetAndInchesToCentimeters(double inches) {
//
//        if(inches < 0) {
//            return -1;
//        }
//
//        double feet = (int) inches / 12;
//        double remainingInches = (int) inches % 12;
//        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
//        return calcFeetAndInchesToCentimeters(feet, remainingInches);
//    }
//
//
//}

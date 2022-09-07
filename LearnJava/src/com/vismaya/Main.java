package com.vismaya;

public class Main {
    public static void main(String[] args) {
        Car ford = new Car();
        ford.setColor("Bronze");
        ford.setModel("carrera");
        System.out.println("The color is: " +ford.getColor());
        System.out.println("The modle is: "+ford.getModel());
        System.out.println("The number of doors: " +ford.getDoors());
    }
}

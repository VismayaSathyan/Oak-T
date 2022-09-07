package com.vismaya;

public class Car {
    //private int doors;
    private String model;
    private String color;

//    public void setDoors(int doors){
//        this.doors = doors;
//    }
    public int getDoors(){
        if(model.equals("carrera")) {
            return 2;
        }
        else {
            return 4;
        }
    }

    public void setModel(String model){
        if(model.equals("carrera") || model.equals("comodore"))
        this.model = model;
        else
            this.model = "Unknown";
    }
    public String getModel(){
        return  model;
    }

    public void setColor(String color){
        this.color = color;
        if(color.equals("Bronze") || color.equals("Magenta"))
            System.out.println("Brand's Exotic color collection");
        else
            System.out.println("Custom Brand");
    }
    public String getColor(){
        return color;
    }
}

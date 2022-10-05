package com.vismaya.opps;

public class VipCustomer {
    private String name;
    private long creditLimit;
    private String emailAddress;

    public VipCustomer(){
        this("Tim", 150000, "timbuckchala@gmail.in");
        System.out.println("Empty Construcor called");
    }

    public VipCustomer(String name, long number){
        this(name, number, "vis@gmail.in");
        System.out.println("Constructor with two parameters called");
    }
    public VipCustomer(String name, long number, String emailAddress){
        System.out.println("Constructor with all the parameters called");
        this.name = name;
        this.creditLimit = number;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public long getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}


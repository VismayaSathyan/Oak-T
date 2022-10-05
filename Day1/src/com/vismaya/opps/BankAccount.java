package com.vismaya.opps;

public class BankAccount {
    private long accNum;
    private double balance;
    private String cusName;
    private String email;
    private long phone;
    public void setAccNum(long accNum){
    this.accNum=accNum;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public void setCusName(String cusName){
        this.cusName = cusName;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPhone(long phone){
        this.phone=phone;
    }
    public long getAccNum(){
        return accNum;
    }
    public double getBalance(){
        return balance;
    }
    public String getCusName(){
        return cusName;
    }
    public String getEmail(){
        return email;
    }
    public long getPhone(){
        return phone;
    }
    public double deposit (double depo){
       return balance = (depo<=0) ? -1 : depo + balance;
    }
    public double withdraw (double withdrw){
        return balance = (balance-withdrw<0) ? -1 : balance - withdrw;
    }
}

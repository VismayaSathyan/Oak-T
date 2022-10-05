package com.vismaya.opps;

import java.util.Scanner;

public class MainClasses {
    public static void main(String[] args) {
//        BankAccount account = new BankAccount();
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the account number: ");
//        long accNum = sc.nextLong();
//        System.out.print("Enter the customer name: ");
//        String cusName = sc.nextLine();
//        sc.nextLine();
//        System.out.print("Enter the emailID: ");
//        String email = sc.nextLine();
//        System.out.print("enter your phone number: ");
//        long phone = sc.nextLong();
//        account.setBalance(700);
//        double balance = account.getBalance();
//        account.setAccNum(accNum);
//        account.getAccNum();
//        account.setCusName(cusName);
//        account.getCusName();
//        account.setEmail(email);
//        account.getEmail();
//        account.setPhone(phone);
//        account.getPhone();
//        System.out.print("Enter the 1 to withdraw 2 to deposite: ");
//        int choice = sc.nextInt();
//        if(choice == 1){
//            System.out.println("Enter withdraw amount: ");
//            double withdrw = sc.nextDouble();
//            if(balance-withdrw<0) {
//                System.out.println("Sorry! Cant withdraw "+withdrw+" only " + balance + " is available in your account");
//            } else
//            System.out.println(withdrw+" withdrewed, the current balance is " +account.withdraw(withdrw));
//            //System.out.println(account.withdraw(withdrw););
//        }else if(choice==2){
//            System.out.println("Enter amount to deposite: ");
//            double depo = sc.nextDouble();
//            System.out.println(depo+" deposited, the current balance is " +account.deposit(depo));
//            //System.out.println(account.deposit(depo));
//        }else {
//            System.out.println("Invalid choice!");
//        }
        VipCustomer visAccount = new VipCustomer(); //("pepp", 890897); //("vis", 9087654, "enamil@wong.in"); // calling all the three constructors;
        System.out.println("Name: " + visAccount.getName() + " Credit Limit: " + visAccount.getCreditLimit() + " Email: " + visAccount.getEmailAddress()); //to display we have to use getters

        VipCustomer visAccount1 = new VipCustomer("pepp", 890897);
        System.out.println("Name: " + visAccount1.getName() + " Credit Limit: " + visAccount1.getCreditLimit() + " Email: " + visAccount1.getEmailAddress());

        VipCustomer visAccount2 = new VipCustomer("vis", 9087654, "enamil@wong.in"); // calling all the three constructors;
        System.out.println("Name: " + visAccount2.getName() + " Credit Limit: " + visAccount2.getCreditLimit() + " Email: " + visAccount2.getEmailAddress());
    }
}

package com.coffeemenu;

// Main class
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789");
        account.deposit(1000);
        account.withdraw(500);
        System.out.println("Current balance: " + account.getBalance());
    }
}

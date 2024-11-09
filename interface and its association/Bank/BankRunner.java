package com.xworkz.Abstraction.Bank;

public class BankRunner {
    public static void main(String[] args) {
        BankRule bank=new BankRuleImpl();
        Bank bank1=new Bank(bank);
        bank1.closeSavingsAccount();
        bank1.openSavingsAccount();
    }
}

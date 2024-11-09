package com.xworkz.Abstraction.Bank;

public class BankRuleImpl implements BankRule{
    @Override
    public int openAccount() {
        return 0;
    }

    @Override
    public void closeAccount() {
        System.out.println("accout closed successfully");
    }
}

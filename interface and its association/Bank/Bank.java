package com.xworkz.Abstraction.Bank;

public class Bank {
    BankRule bankRule;

    Bank(BankRule bankRule) {
        this.bankRule = bankRule;
    }

    public void openSavingsAccount() {

        int rule = bankRule.openAccount();
        if (rule == 0) {
            System.out.println("opened new account");

        }
    }
        void closeSavingsAccount() {
            bankRule.closeAccount();
        }
    }

package com.cognizant.practice.solid.lsp;

public class CheckingAccount extends WithdrawableAccount {
    public CheckingAccount(double balance) {
        super(balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Not enough balance");
        }
    }
}

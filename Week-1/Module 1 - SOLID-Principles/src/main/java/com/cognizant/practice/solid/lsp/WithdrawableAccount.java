package com.cognizant.practice.solid.lsp;

public abstract class WithdrawableAccount extends Account {
    public WithdrawableAccount(double balance) {
        super(balance);
    }

    public abstract void withdraw(double amount);
}

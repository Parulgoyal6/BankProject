package com.smart.model;


import jakarta.persistence.Id;

import jakarta.persistence.Entity;

@Entity
public class BankAccount {

    @Id
    private String accountNo;
    private String accountHolderName;
    private double balance;

    // Getters and Setters

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

package com.practice.chapter1.practice7;

public class Account {
    private Integer id;
    private String owner;
    private Double balance;

    public Account(Integer id, String owner, Double balance) {
        this.id = id;
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(Double amount) {
        balance += amount;
    }

    public void withdraw(Double amount) {
        balance -= amount;
    }

    protected Double getBalance() {
        return balance;
    }
}

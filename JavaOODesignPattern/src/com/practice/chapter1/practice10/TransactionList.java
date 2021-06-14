package com.practice.chapter1.practice10;

public class TransactionList {
    private Employee employee;
    private Transaction transaction;
    private String date;
    private Integer duration;

    public TransactionList(Employee employee, Transaction transaction, String date, Integer duration) {
        this.employee = employee;
        this.transaction = transaction;
        this.date = date;
        this.duration = duration;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public String getDate() {
        return date;
    }

    public Integer getDuration() {
        return duration;
    }
}

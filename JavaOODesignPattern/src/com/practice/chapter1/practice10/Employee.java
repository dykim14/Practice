package com.practice.chapter1.practice10;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private List<TransactionList> transactionList;

    public Employee() {
        transactionList = new ArrayList<>();
    }

    public void addTransaction(TransactionList transactionList) {
        this.transactionList.add(transactionList);
    }

    public void removeTransaction(TransactionList transactionList) {
        this.transactionList.remove(transactionList);
    }

    public List<TransactionList> getTransactionList() {
        return transactionList;
    }
}

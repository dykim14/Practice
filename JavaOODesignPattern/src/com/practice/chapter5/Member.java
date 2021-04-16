package com.practice.chapter5;

public class Member {
    private String name;
    private int totalRentalFee;

    public Member(String name, int totalRentalFee) {
        this.name = name;
        this.totalRentalFee = totalRentalFee;
    }

    public String getName() {
        return name;
    }

    public int getTotalRentalFee() {
        return totalRentalFee;
    }

    public void addRentalFee(int totalRentalFee) {
        this.totalRentalFee += totalRentalFee;
    }
}

package com.practice.chapter5.practice3;

import java.util.List;

public class TotalRentalFeeDiscountPolicy implements IDiscountPolicy {
    public static final int DISCOUNT_PRICE = 10000;
    public static final float DISCOUNT_RATE = 0.1f;

    @Override
    public int applyDiscount(List<Book> bookList, int totalRentalFee) {
        int discount = 0;
        for (Book book : bookList) {
            if (totalRentalFee > DISCOUNT_PRICE) {
                discount += book.price * DISCOUNT_RATE;
            }
        }
        return discount;
    }
}

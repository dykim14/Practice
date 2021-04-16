package com.practice.chapter5;

import java.util.List;

public class OldBookDiscountPolicy implements IDiscountPolicy {
    public static final float DISCOUNT_RATE = 0.2f;
    public static final int DISCOUNT_OLD_YEAR = 2021 - 10;

    @Override
    public int applyDiscount(List<Book> bookList, int totalRentalFee) {
        int discount = 0;
        for (Book book : bookList) {
            if (book.year <= DISCOUNT_OLD_YEAR) {
                discount += book.price * DISCOUNT_RATE;
            }
        }
        return discount;
    }
}

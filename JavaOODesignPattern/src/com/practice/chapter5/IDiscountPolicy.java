package com.practice.chapter5;

import java.util.List;

public interface IDiscountPolicy {
    int applyDiscount(List<Book> bookList, int totalRentalFee);
}

package com.practice.chapter5;

import java.util.ArrayList;
import java.util.List;

public class BookStore {
    private final List<Member> memberList = new ArrayList<>();
    private final List<Book> bookList = new ArrayList<>();
    private final List<IDiscountPolicy> discountPolicyList = new ArrayList<>();

    public void addBook(Book book) {
        if (book != null) {
            bookList.add(book);
        }
    }

    public void addMember(Member member) {
        if (member != null) {
            memberList.add(member);
        }
    }

    public void addDiscountPolicy(IDiscountPolicy policy) {
        if (policy != null) {
            discountPolicyList.add(policy);
        }
    }

    public int buy(Member member, List<Book> bookList) {
        int totalPrice = 0;
        for (Book book : bookList) {
            totalPrice += book.price;
        }
        totalPrice -= applyDiscountPolicy(member, bookList);
        System.out.print(member.getName() + "님은 ");
        for (Book book : bookList) {
            System.out.print(book.name + " ");
        }
        System.out.println("책을 총 " + totalPrice + "원에 구매하셨습니다.");
        return totalPrice;
    }

    public void buy(Member member, Book book) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(book);
        int realPrice = book.price - applyDiscountPolicy(member, bookList);
        member.addRentalFee(realPrice);
        System.out.println(member.getName() + "님은 " + book.name + "책을 " + realPrice + "원에 구매하셨습니다.");
    }

    private int applyDiscountPolicy(Member member, List<Book> bookList) {
        int discount = 0;
        for (IDiscountPolicy policy : discountPolicyList) {
            discount += policy.applyDiscount(bookList, member.getTotalRentalFee());
        }
        return discount;
    }

    public static void main(String[] args) {
        BookStore bookStore = new BookStore();
        Book novel = new Book("해리포터", 1994, 7000);
        Book comicBook = new Book("슬램덩크", 2020, 13000);
        bookStore.addBook(novel);
        bookStore.addBook(comicBook);

        Member john = new Member("John", 0);
        Member jihwan = new Member("JiHwan", 500000);
        bookStore.addMember(john);
        bookStore.addMember(jihwan);

        bookStore.addDiscountPolicy(new OldBookDiscountPolicy());
        bookStore.addDiscountPolicy(new TotalRentalFeeDiscountPolicy());

        bookStore.buy(john, novel);
        ArrayList<Book> books = new ArrayList<>();
        books.add(novel);
        books.add(comicBook);
        bookStore.buy(john, books);

        bookStore.buy(jihwan, novel);
        bookStore.buy(jihwan, books);
    }
}

package com.practice.chatper6.solution1;

public class Printer {
    private static Printer printer = new Printer();
    private int counter = 0;
    private Printer() {}

    public static Printer getPrinter() {
        return printer;
    }

    public void print(String str) {
        counter++;
        System.out.println(str);
    }
}

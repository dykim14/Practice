package com.practice.chatper6.solution2;

public class Printer {
    private static Printer printer = null;
    private Printer() {}

    public synchronized static Printer getPrinter() {
        if (printer == null) {
            printer = new Printer();
        }
        return printer;
    }

    public void print(String str) {
        System.out.println(str);
    }
}

package com.practice.chatper6.unittest1;

public class RealPrinter315 implements Printer {
    private static Printer printer = null;

    private RealPrinter315() {}

    public static synchronized Printer getPrinter() {
        if (printer == null) {
            printer = new RealPrinter315();
        }
        return printer;
    }

    @Override
    public void print(String str) {

    }
}

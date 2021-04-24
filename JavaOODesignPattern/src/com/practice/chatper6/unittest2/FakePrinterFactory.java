package com.practice.chatper6.unittest2;

public class FakePrinterFactory extends PrinterFactory {
    private static Printer printer = null;

    public static synchronized Printer getFakePrinter() {
        if (printer == null) {
            printer = new FakePrinter();
        }
        return printer;
    }
    public Printer getPrinter() {
        return getFakePrinter();
    }
}

package com.practice.chatper6.unittest2;

public class PrinterFactory {
    private static PrinterFactory printerFactory = null;

    protected PrinterFactory() {}

    public static PrinterFactory getPrinterFactory() {
        if (printerFactory == null) {
            printerFactory = new PrinterFactory();
        }
        return printerFactory;
    }

    public static void setPrinterFactory(PrinterFactory p) {
        printerFactory = p;
    }

    public Printer getPrinter() {
        return RealPrinter315.getPrinter();
    }
}

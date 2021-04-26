package com.practice.chatper6.practice3;

public class UserThread extends Thread {
    private Printer myPrinter;

    public UserThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        PrinterManager mgr = PrinterManager.getPrinterManager();
        myPrinter = mgr.getPrinter();
        myPrinter.print(getName());
    }
}

package com.practice.chatper6.practice3;

import java.util.ArrayList;
import java.util.List;

public class PrinterManager {
    private static final int PRINTER_NUM = 3;
    private static PrinterManager instance = null;
    private static final List<Printer> printerList = new ArrayList<>();

    private PrinterManager() {
        for (int i = 0; i < PRINTER_NUM; i++) {
            printerList.add(new Printer());
        }
    }

    public synchronized static PrinterManager getPrinterManager() {
        if (instance == null) {
            instance = new PrinterManager();
        }
        return instance;
    }

    public synchronized Printer getPrinter() {
        while (true) {
            for (Printer p : printerList) {
                if (p.isAvailable()) {
                    p.setAvailable(false);
                    return p;
                }
            }
        }
    }
}

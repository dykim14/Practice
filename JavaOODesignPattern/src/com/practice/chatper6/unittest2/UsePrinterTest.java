package com.practice.chatper6.unittest2;

import static org.junit.jupiter.api.Assertions.*;

class UsePrinterTest {

    @org.junit.jupiter.api.Test
    void doSomething() {
        FakePrinterFactory fake = new FakePrinterFactory();
        UsePrinter usePrinter = new UsePrinter();
        PrinterFactory.setPrinterFactory(fake);
        usePrinter.doSomething();
        assertEquals("123", ((FakePrinter)fake.getPrinter()).get());
    }
}
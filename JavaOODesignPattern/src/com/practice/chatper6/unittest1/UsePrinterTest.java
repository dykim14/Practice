package com.practice.chatper6.unittest1;

import static org.junit.jupiter.api.Assertions.*;

class UsePrinterTest {

    @org.junit.jupiter.api.Test
    void doSomething() {
        FakePrinter fake = new FakePrinter();
        UsePrinter usePrinter = new UsePrinter();
        usePrinter.doSomething(fake);
        assertEquals("123", fake.get());
    }
}
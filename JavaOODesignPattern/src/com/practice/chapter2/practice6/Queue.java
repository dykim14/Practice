package com.practice.chapter2.practice6;

import java.util.LinkedList;

public class Queue<String> extends LinkedList<String> {
    public boolean addQueue(String element) {
        return add(element);
    }

    public String removeQueue() {
        return removeFirst();
    }

    public String peekQueue() {
        return peekFirst();
    }
}

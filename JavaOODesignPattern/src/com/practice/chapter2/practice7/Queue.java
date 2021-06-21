package com.practice.chapter2.practice7;

import java.util.LinkedList;

public class Queue<String> {
    private LinkedList<String> linkedList;

    public Queue() {
        linkedList = new LinkedList<>();
    }

    public boolean addQueue(String element) {
        return linkedList.add(element);
    }

    public String removeQueue() {
        return linkedList.removeFirst();
    }

    public String peekQueue() {
        return linkedList.peekFirst();
    }
}

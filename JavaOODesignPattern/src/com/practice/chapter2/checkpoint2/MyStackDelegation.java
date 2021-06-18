package com.practice.chapter2.checkpoint2;

import java.util.Vector;

public class MyStackDelegation<String> {
    private Vector<String> vectorList = new Vector<>();

    public void push(String element) {
        vectorList.add(element);
    }

    public String pop() {
        return vectorList.remove(vectorList.size() - 1);
    }

    public int size() {
        return vectorList.size();
    }

    public boolean isEmpty() {
        return vectorList.isEmpty();
    }
}

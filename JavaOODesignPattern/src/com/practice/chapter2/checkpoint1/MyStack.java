package com.practice.chapter2.checkpoint1;

import java.util.ArrayList;

public class MyStack<String> extends ArrayList<String> {
    public void push(String element) {
        add(element);
    }

    public String pop() {
        return remove(size() - 1);
    }
}

class Main {
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();
        stack.push("a");
        System.out.println(stack);
        stack.push("b");
        System.out.println(stack);
        stack.push("c");
        System.out.println(stack);
        stack.remove(0);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
    }
}

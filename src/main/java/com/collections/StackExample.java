package com.collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> books = new Stack<>();
        books.add("Harry Potter");
        books.add("Tamil Book");
        books.add("Ponniyen Selvan");
        System.out.println(books.pop());
        System.out.println(books.pop());
        System.out.println(books.pop());
        System.out.println(books.peek());


        System.out.println(books);
    }
}

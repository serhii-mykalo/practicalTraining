package ua.goit.module9.stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.peek() = " + stack.peek());

        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        stack.push("Fourth");
        stack.push("Fifth");
        System.out.println("stack.size() = " + stack.size());

        stack.remove(1);
        System.out.println("stack.size() = " + stack.size());

        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.size() = " + stack.size());

        System.out.println("stack.peek() = " + stack.peek());
        System.out.println("stack.size() = " + stack.size());

        stack.clear();
        System.out.println("stack.size() = " + stack.size());
    }
}

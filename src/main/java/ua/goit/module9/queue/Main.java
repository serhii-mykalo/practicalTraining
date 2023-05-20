package ua.goit.module9.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        System.out.println("queue.peek() = " + queue.peek());
        System.out.println("queue.poll() = " + queue.poll());

        queue.add("First");
        queue.add("Second");
        queue.add("Third");
        queue.add("Fourth");
        queue.add("Fifth");
        System.out.println("queue.size() = " + queue.size());

        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.size() = " + queue.size());

        System.out.println("queue.peek() = " + queue.peek());
        System.out.println("queue.size() = " + queue.size());

        queue.clear();
        System.out.println("queue.size() = " + queue.size());
    }
}

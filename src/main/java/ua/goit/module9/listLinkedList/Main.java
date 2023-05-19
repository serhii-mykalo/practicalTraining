package ua.goit.module9.listLinkedList;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        list.add("First");
        list.add("Second");
        list.add("Third");
        System.out.println("list = " + list);

        String remove = list.remove(1);
        System.out.println("remove = " + remove);
        list.size();

        System.out.println("list = " + list);
    }
}

package ua.goit.module9.listArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //При ініціалізації містись 10 комірок
        List<String> list = new ArrayList<>();

        list.add("First");
        list.add("Second");
        list.add("Third");
        for (String element : list) {
            System.out.println(element);
        }

        list.add(1, "Fifth");
        System.out.println("------------");
        for (String element : list) {
            System.out.println(element);
        }

        Collections.sort(list);
        System.out.println(list);

        System.out.println(list.get(1));

        List<String> newList = list.subList(1, 3);
        System.out.println(newList);
    }
}

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

        System.out.println("list.remove(3) = " + list.remove(3));

//      String remove = list.remove(1);
//      System.out.println("remove = " + remove);

//        list.clear();
//        System.out.println("list.get(0) = " + list.get(0));

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

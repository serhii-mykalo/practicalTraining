package ua.goit.module9.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        collection.add("First");
        collection.add("Second");
        collection.add("Third");
        System.out.println("Size before clearing " + collection.size());

        print(collection);

        System.out.println("Size after clearing " + collection.size());

    }

    private static void print(Collection<String> collection) {
        //Через foreach видаляти елементи не можна
//        for (String element : collection) {
//            System.out.println(element );
//        }

        //Через ітератор можна видаляти елементи
        Iterator<String> iterator = collection.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }
    }
}

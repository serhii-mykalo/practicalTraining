package ua.goit.module9.myHashMap;


public class MyHashMapTests {
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();

        map.put("для чоловіка", "рубашка");
        map.put("для новонародженого", "бодік");
        map.put("для хлопчика", "кепка");
        map.put("для жінки", "плаття");

        System.out.println("map.size() = " + map.size());
        System.out.println("map.get() = " + map.get("для хлопчика"));
        map.remove("для жінки");
        System.out.println("map.size() = " + map.size());

    }
}

package data_structures;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMaps {

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 223);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        Map<String, Employee> hashMap = new HashMap<String, Employee>();

        // put() to insert key/value pair
        hashMap.put("Jones", janeJones);
        hashMap.put("Doe", johnDoe);
        hashMap.put("Smith", marySmith);

        //get() method returns KEY/VALUE or OBJECT Key from MAP
        System.out.println(hashMap.get("Smith"));
        //OR

        //getOrDefault() method returns OBJECT or SPECIFIED DEFAULT VALUE
        System.out.println(hashMap.getOrDefault("someone", mikeWilson));

        //remove() method removes OBJECT from MAP
        System.out.println(hashMap.remove("Jones"));

        //containsKey() method searches for the KEY: returns boolean value based on whether the element is present or not
        System.out.println(hashMap.containsKey("Doe"));

        //containsValue() method searches for the VALUE: returns boolean value ^^^^
        System.out.println(hashMap.containsValue(janeJones));

        //putIfAbsent() method will place a KEY/VALUE into a MAP if the neither are present: prevent collisions
        hashMap.putIfAbsent("Doe", mikeWilson);

        //Iterator interface is part of the Collections Framework can implement the following Interfaces:
        // List, Set, Comparator, SortedSet, Queue, Deque
        Iterator<Employee> iterator = hashMap.values().iterator();
//        while(iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
        // forEach() exclusive to Java 8 & beyond
        hashMap.forEach((k, v) -> System.out.println("Key = " + k + ", Employee = " + v));
    }
}

package Collection_framework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(11 , 0.3f , true);
        //Access order - by default it is false but if we do it true and then access by get method
        // and after accessing , the value that we accessed will go to the end of the list means if we again
        // try to iterate it it will be not in order it will be at last
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Orange", 10);
        hashMap.put("apple", 20);
        hashMap.put("banana", 30);
        hashMap.getOrDefault("banana" , 0); // if banana is present so return otherwise
        // default value 0
        hashMap.putIfAbsent("lemon" , 40); // insert if this value is not present
        for (Map.Entry<String , Integer>  Entry : hashMap.entrySet()) {
            System.out.println(Entry.getKey() + " " + Entry.getValue()); // not in order
        }
        linkedHashMap.put("orange" , 11);
        linkedHashMap.put("apple" , 12);
        linkedHashMap.put("banana" , 13);
        linkedHashMap.get("orange"); // now it will go to last while accessing

        for (Map.Entry<String , Integer>  Entry :  linkedHashMap.entrySet()) {
            System.out.println(Entry.getKey() + " " + Entry.getValue()); // order is maintained
            // due to present of doubly linked list inside , a little bit slower than hashmap
        }

    }
}

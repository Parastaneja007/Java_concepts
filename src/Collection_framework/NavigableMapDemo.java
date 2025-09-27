package Collection_framework;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {
    public static void main(String[] args) {
        NavigableMap<Integer, String> navigableMap = new TreeMap<>();
        navigableMap.put(1 , "one");
        navigableMap.put(5 , "five");
        navigableMap.put(3 , "three");
        System.out.println(navigableMap);
        //returns the greatest key strictly less than the given key
        System.out.println(navigableMap.lowerEntry(4));
        System.out.println(navigableMap.ceilingEntry(4)); // upper key if the given key not presen
        // if present than the same
        System.out.println(navigableMap.higherEntry(1)); // return the upper higher value
    }
}

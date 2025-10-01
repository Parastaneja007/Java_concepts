package Collection_framework;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo {
    public static void main(String[] args) {
        Map<String , Integer> map1 = new HashMap<>();
        map1.put("A" , 1);
        map1.put("B" , 2);
        // 1st way for immutable map
        Map<String, Integer> map2 = Collections.unmodifiableMap(map1);
        System.out.println(map2);
//        map2.put("c" , 3); // throws exception , no modification in map 2
        // so it can be done with map 1 which means it can be modified so it is not a good thing and
        // we did not use like this
        // we use
        Map<String, Integer> map3 = Map.of("A", 1, " b ", 2, "c", 3);
        System.out.println(map3); // can not edit and cannot store more than 10 elements inside
        // to store more than 10 elements we use Map.ofentries
        Map<String, Integer> map4 = Map.ofEntries(Map.entry("A", 1), Map.entry("b", 2));
        System.out.println(map4);


    }
}

package Collection_framework;


import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class SetOverview {
    public static void main(String[] args) {
        //Set is a collection that cannot contains duplicate elements .
        // faster operation
        //Map --> HashMap , LinkedHashMap , TreeMap , EnumMap
        // set ->//HashSet , LinkedHashSet , TreeSet , EnumSet
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(10);
        set.add(2);
        System.out.println(set); // not in order , for order use LinkedHashSet
        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(3);
        set2.add(5);
        set2.add(2);
        System.out.println(set2); // ordered maintained , but if we need things in sorted manner
        // then use TreeSet
        Set<Integer> set3 = new TreeSet<>();
        set3.add(3);
        set3.add(2);
        set3.add(1);
        set3.add(7);
        System.out.println(set3); // in sorted manner
        // for thread safety
//        Set<Integer> integers = Collections.synchronizedSet(set); // we have given HashSet
        // not use above because of complexity
        ConcurrentSkipListSet<Integer> set4 = new ConcurrentSkipListSet<>(); // use this meathod
        //to achieve synchronisation
        //unmodifiable
        Set<Integer> integers = Set.of(1, 2, 3, 4,  64, 6, 76, 86);
        // it can be more than 10 also in above
        System.out.println(integers);
        // another meathod
        Collections.unmodifiableSet(set2); // it will make the set immutable
    }
}

package streams;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorDemo {
    public static void main(String[] args) {
        // Collectors is a utility class
        //provides a set of methods to create common collector
        // 1 . collecting to a list
        List<String> names = Arrays.asList("Alice", "Bob", " Charlie");
        List<String> res = names.stream()
                .filter(x -> x.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(res);

        // 2 . collecting to a set
        List<Integer> nums = Arrays.asList(1, 2, 2, 3, 3, 4, 5, 6, 6);
        Set<Integer> set = nums.stream().collect(Collectors.toSet());
        System.out.println(set);

        // 3. collecting to a specified collection
        names.stream().collect(Collectors.toCollection(() -> new ArrayDeque<>()));

        // 4 . Joining strings
        //concatenates stream elements into single string 
        String joining = names.stream().map(String::toUpperCase).collect(Collectors.joining(" , "));
        System.out.println(joining);

        // 5 . summarizing data
        // generates statistical summary ( count , sum , min , average , max )
        List<Integer> numbers = Arrays.asList(2, 4, 7, 5, 9);
        IntSummaryStatistics stats = numbers.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println("count " + stats.getCount());
        System.out.println("sum " + stats.getSum());
        System.out.println("minimum " + stats.getMin());
        System.out.println("maximum " + stats.getMax());
        System.out.println("Average " + stats.getAverage());

        // 6 . calculating averages
        Double avg = numbers.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println(avg);

        // 7 . counting elements
        Long count = numbers.stream().collect(Collectors.counting());
        System.out.println(count);

        // 8 . grouping
        List<String> group = Arrays.asList("hello", "world ", " java", " stream", " collecting");
         System.out.println(group.stream().collect(Collectors.groupingBy(String::length)));
        System.out.println(group.stream().collect(Collectors.groupingBy(String::length , Collectors.counting())));
        TreeMap<Integer, Long> treemap = group.stream().collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting()));
        System.out.println(treemap);

        // 9 . partitioning elements
        // partition elements into two groups ( true and false ) based on a predicate
        System.out.println(group.stream().collect(Collectors.partitioningBy(x -> x.length() > 5)));

        // 10 . mapping and collecting
        // applies a mapping before collecting
        List<String> collect = group.stream().collect(Collectors.mapping(x -> x.toUpperCase(), Collectors.toList()));
        System.out.println(collect);
        
    }
}

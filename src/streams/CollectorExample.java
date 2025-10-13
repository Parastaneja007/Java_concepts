package streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorExample {
    public static void main(String[] args) {
        // example 1 - collecting names by length
        List<String> l1 = Arrays.asList("anna", " bob", " alexander", " brian", "alice");
        System.out.println(l1.stream().collect(Collectors.groupingBy(String::length)));

        // example 2 - counting word occurrences
        String sentence = "hello world java hello world";
        System.out.println(Arrays.stream(sentence.split(" "))
                .collect(Collectors.groupingBy(x -> x, Collectors.counting())));

        // example 3 - partitioning even and odd numbers
        List<Integer> numbers = Arrays.asList(2, 4, 3, 7, 8, 12, 35, 67);
        System.out.println(numbers.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0)));

        // example 4 - summing values in a map
        Map<String , Integer> items = new HashMap<>();
        items.put("Apple" , 10);
        items.put("Banana" , 20);
        items.put("orange" , 15);
        // two ways to solve
        System.out.println(items.values().stream().reduce(Integer::sum).get());
        System.out.println(items.values().stream().collect(Collectors.summingInt(x -> x)));

        // example 5 - create a map from stream element
        List<String> fruits = Arrays.asList("apple", "mango", "banana");
        System.out.println(fruits.stream().collect(Collectors.toMap(x -> x.toUpperCase() , x -> x.length())));
    }
}

package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOpr {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        // 1. collect
        list.stream().skip(1).collect(Collectors.toList());
        list.stream().toList(); // same function as above
        // 2 . for each
        list.stream().forEach(x -> System.out.println(x));
        // 3. reduce -- combines element to produce a single result
        Optional<Integer> optionalInteger = list.stream().reduce((x, y) -> x + y);
        System.out.println(optionalInteger.get());
        // 4 . count - already studied
        // 5 . anyMatch , allMatch , noneMatch
        boolean b = list.stream().anyMatch(x -> x % 2 == 0); // if any number is even then return true
        System.out.println(b);
        boolean b1 = list.stream().allMatch(x -> x % 2 == 0); // returns true if all numbers are even
        System.out.println(b1);
        boolean b2 = list.stream().noneMatch(x -> x < 0);// returns true if nothing is matched
        System.out.println(b2);
        // 6 . findFirst , findAny
        System.out.println(list.stream().findFirst().get()); // returns the first element
        System.out.println(list.stream().findAny().get()); // returns any element
        // 7 . toArray()
        Object[] array = Stream.of(1, 2, 3).toArray();
         // 8 . min / max
        System.out.println("max " + Stream.of(2 , 7 , 85 , 4).max(Comparator.naturalOrder()).get());
        System.out.println("min " + Stream.of(2 , 7 , 85 , 4).min(Comparator.naturalOrder()).get());
        // example - filtering and collecting names
        List<String> names = Arrays.asList("Anna", "Bob", "Charlie", "David");
        Stream<String> lengthFind = names.stream().filter(x -> x.length() > 3);
        List<String> finalNmaes = lengthFind.toList();
        System.out.println(finalNmaes);
        // example -- squaring and sorting numbers
        List<Integer> list1 = Arrays.asList(5, 2, 9, 1, 6);
          System.out.println(list1.stream().map(x -> x * x ).sorted().toList());
          // summing values
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6);
         System.out.println(list2.stream().reduce(Integer :: sum).get());
         // example occurrence of a character
        String sentence = "Hello world"; //chars is used in place of streams in strings
        long count = sentence.chars().filter(x -> x == 'l').count();
        System.out.println(count);
        // stateful and stateless operation
        // in stateful operation , it should know about all the element before executing like sorting
        // in stateless operation , it works on a single element which is needed currently ...
    }
}

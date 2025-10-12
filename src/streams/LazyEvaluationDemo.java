package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazyEvaluationDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        Stream<String> stringStream = names.stream().filter(name -> {
            System.out.println("filtering " + name); // it will not get printed as there is no terminal
            //operation ..
            return name.length() > 3;
        });
        System.out.println("Before terminal operation");
        List<String> result = stringStream.collect(Collectors.toList());
        System.out.println("After terminal operation");
        System.out.println(result);
        
    }
}


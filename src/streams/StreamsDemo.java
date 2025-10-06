package streams;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        // feature produced in java 8
        //process collections of data in functional and declarative manner.
        // simplify data Processing
        // improve readability and maintainability
        // enable easy parallelism

        // how to use streams ?
        // streams -- a sequence of element supporting  functional and declarative programming .
        // source ,intermediate operations and terminal operation
        // without streams example
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int count = 0 ;
        for(int i : numbers){
            if(i % 2 == 0 ){
                count ++ ;
            }
        }
        System.out.println(count);
        // now with streams
        System.out.println(numbers.stream().filter(x -> x % 2 == 0 ).count());
        // creating streams
        // 1. from collections
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        Stream<Integer> stream1 = list1.stream();
        // 2. from arrays
        String[] arrays = {"a" , "b" , "c"};
        Stream<String> stream2 = Arrays.stream(arrays);
        //3 . using stream.of()
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);//if we give strings inside the
        //streams of strings will be created
        //4 . infinite streams
        Stream<Integer> generate = Stream.generate(() -> 1);
        Stream.iterate(1 , x -> x+1);
    }
}

package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermidiateOpr {
    public static void main(String[] args) {
        // intermediate operation transform a stream into another stream .
        // they are lazy means they did not execute until a terminal operation is invoked .
        //1. filter
        List<String> list = Arrays.asList("paras", "parv", "mukul");
        Stream<String> filteredStream = list.stream().filter(x -> x.startsWith("p"));
        // no filtered at above point , no filter until terminal condition
        //  like count below
        long res = filteredStream.count();
        System.out.println(res);
        // 2. map -- it takes a function means convert data , one data comes and gives another
        Stream<String> UpperCase = list.stream().map(x -> x.toUpperCase());
        // 3. sorted -- for natural ordering
        Stream<String> sorted = list.stream().sorted();
        list.stream().sorted((a , b) -> a.length() - b.length());
        // 4 . distinct -- for unique value -- eliminate two words which are same
        Stream<String> distinct = list.stream().distinct();
        // 5 . limit
//       Stream.iterate(1 , x-> x+1 ).count(); // this will generate a infinite loop so we can
        //put limit for particular number we want it to run
        Stream.iterate(1 , x-> x+1 ).limit(100);
        // 6 . skip
        Stream.iterate(1 , x-> x+1 ).skip(10).limit(100);
        // used to skip some things , in above first 10 are skiped , it will start from 11 and go till
        // 110 because limit is 100
        // 7 . peek
        //performs an action on each element as it is consumed
        Stream.iterate(1 , x-> x+1 ).skip(10).limit(100).peek(System.out ::println).count();
        // 8 . flatMap
        // handles streams of collections , lists or arrays where each element is itself a collection
        // flatten nested structure ( eg lists within lists ) so that they can be processed as a single
        // sequence of element
        // transform and flatten element at the same time ...
        List<List<String>> listsoflists = Arrays.asList(
                Arrays.asList("mango", "banana"),
                Arrays.asList("apple", "orange"),
                Arrays.asList("grapes", "kiwi ")
        );
        System.out.println(listsoflists.get(1).get(0));
        System.out.println(listsoflists.stream().flatMap(x -> x.stream()).map(String::toUpperCase).toList());

    }
}

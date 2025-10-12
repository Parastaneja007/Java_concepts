package streams;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        // a type of stream that enables parallel processing of elements
        // allowing multiple threads to process parts of streams simultaneously
        // this can significantly improve performance for large data sets
        // workload is distributed across multiple threads
        long startTime = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1, x -> x + 1).limit(20000).toList();
        List<Long> factorialslist = list.stream().map(ParallelStreamDemo::factorial).toList();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken with streams "  + (endTime - startTime) + "ms");
        // the above one will take more time but if we will use parallel stream instead of stream it
        // take less time as compared to streams , now below i will use parallel stream
        startTime = System.currentTimeMillis();
        factorialslist = list.parallelStream().map(ParallelStreamDemo::factorial).toList();
        endTime = System.currentTimeMillis();
        System.out.println("Time taken with parallel streams " + (endTime - startTime) + "ms");
        // now this above is the case for parallel stream and it will less time as compared to stream
        // parallel stream are most effective for CPU-Intensive or large datasets where task are
        // independent( in which result is not dependent on other - like factorial , every number
        // is independent
        //They may add overhead for simple task and small datasets

        // cumulative sum
        //[ 1 , 2 , 3 , 4 , 5 , 6] -> [1 , 3, 6, 10 . 15....]
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        AtomicInteger sum = new AtomicInteger(0);
        List<Integer> cumulativeSum = numbers.parallelStream().map(sum::addAndGet).toList();
//        List<Integer> cumulativeSum = numbers.parallelStream().map(sum::addAndGet).sequential().toList();
        System.out.println("Expected cumulative result [ 1 , 3, 6 , 10 , 15] ");
        System.out.println("Actual cumulative result " + cumulativeSum);
        // the actual result is not as expected result as they are not independent and we are using
        // parallel streams
    }
    public static long factorial(int n) {
        long result = 1 ;
        for(int i = 2 ; i <= n ; i++ ){
            result *= i ;
        }
        return result ;
    }
}

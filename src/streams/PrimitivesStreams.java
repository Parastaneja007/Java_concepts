package streams;

public class PrimitivesStreams {
    public static void main(String[] args) {

    }
}
//}
//    java provides specialized stream types for primitive data types to avoid autoboxing/unboxing overhead of wrapper objects like Integer, Double, etc.
//
//        The primitive streams are:
//
//        Type	Stream Class	Primitive Type
//        IntStream	for int
//        LongStream	for long
//        DoubleStream	for double
//
//        These classes are in the package java.util.stream.
//
//        ✅ Example: Using a Primitive Stream (IntStream)
//        import java.util.stream.IntStream;
//
//public class PrimitiveStreamExample {
//    public static void main(String[] args) {
//        int sum = IntStream.of(1, 2, 3, 4, 5)
//                .filter(n -> n % 2 == 1)
//                .map(n -> n * n)
//                .sum();
//
//        System.out.println(sum); // 35
//    }
//}
//
//✅ Another Example: Using range
//        IntStream.range(1, 6)  // 1 to 5
//        .forEach(System.out::println);

//4. When and Where to Use Primitive Streams
//        ✅ Use primitive streams when:
//
//        You are dealing with numeric data (int, long, double)
//
//        You need to perform mathematical or statistical operations
//
//        You want to improve performance by avoiding autoboxing
//
//        Examples:
//
//// Efficient numeric computation
//        double average = IntStream.range(1, 1000)
//        .average()
//        .orElse(0);
//
//        ❌ Avoid primitive streams when:
//
//        You’re working with non-primitive types (e.g., custom objects)
//
//        You need heterogeneous data or object transformations

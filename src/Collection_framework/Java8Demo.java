package Collection_framework;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

@FunctionalInterface
interface calculator {
    int add(int a , int b );
}
public class Java8Demo {
    public static void main(String[] args) {
        // streams
        // java 8 -> minimal code , Functional programming
        // java 8 - > lambda expression , streams ,Date and time API
        // lambda expression -
        //it is a anonymous function (no name , no return type , no access modifier )
        calculator c = (a, b) -> a + b;
        System.out.println("sum  " + c.add(10, 20));
        //Predicate -- Functional interface ( interface with only one abstract method )
        // Boolean valued functions
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(4));
        // function
        Function<Integer, Integer> doubleIt = x -> 2 * x;
        Function<Integer, Integer> TripleIt = x -> 3 * x;
        System.out.println(doubleIt.apply(50));
        System.out.println(doubleIt.andThen(TripleIt).apply(20));
        //consumer
        Consumer<Integer> print = x -> System.out.println(x);
        print.accept(51);
        List<Integer> list = Arrays.asList(1, 2, 3);
        Consumer<List<Integer>> printlist = x -> {
            for (int i : x) {
                System.out.println(i);
            }
        };
        printlist.accept(list);
        //supplier -- it only gives , does not take
        // consumer takes the value whereas supplier gives the value
        Supplier<String> givesHello = () -> "hello";
        System.out.println(givesHello.get());
        //BiPredicate , BiConsumer , BiFunction
        BiPredicate<Integer , Integer> isSumEven =(x , y) -> (x + y) % 2 == 0 ;
        System.out.println(isSumEven.test(10 , 20 ));
        BiConsumer<Integer , String> biConsumer =( x , y ) -> {
            System.out.println(x);
            System.out.println(y);
        };
        BiFunction< String , String , Integer > biFunction = ( x , y ) -> ( x + y).length();
        System.out.println(biFunction.apply("paras" , "parv"));
//        Function<Integer, Integer> doubleIt = x -> 2 * x;
// in above we have to write the Integer two time , and they are same ,
// so java introduced unary operatior - same as function but we have to write only one time instead of two
        UnaryOperator<Integer> doubleNum = x -> 2 * x ;
        BinaryOperator<Integer> b = (x , y ) -> x + y ;
        // method reference --  use method without invoking and in place of lambda expression
        List<String> students  = Arrays.asList("Paras", "Parv", "Mukul");
        students.forEach(x -> System.out.println(x));// consumer (using lambda expression)
        students.forEach(System.out::println); // replace lambda expression with method reference
        //constructor reference --learn this later
        List<String> names = Arrays.asList("A", "B", "C");
//        List<MobilePhone> MobilePhoneList;
//        MobilePhoneList = names.stream().map(MobilePhone :: new).collect(Collectors.toList());
    }
    class MobilePhone{
        String name;

        public MobilePhone(String name) {
            this.name = name;
        }
    }
}



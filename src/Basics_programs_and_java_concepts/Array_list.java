package Basics_programs_and_java_concepts;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_list {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(3);
//        numbers.add(5);
//        numbers.add(7);
//        numbers.add(7);
        // enhanced for loop
//        for(Integer arr_list : numbers){
//         System.out.println(arr_list);
//        }
        //normal loop for printing
//        for ( int i = 0 ; i < numbers.size() ; i++){
//            System.out.println(numbers.get(i));
//        }
        // taking inputs
        Scanner input = new Scanner(System.in);
        for(int i = 0 ; i < 5 ; i++ ){
            numbers.add(input.nextInt());
        }
        // enhanced for loop
//        for(Integer num : numbers){
//            System.out.println(num);
//        }
        for( int i = 0 ; i < 5 ; i++){
            System.out.println(numbers.get(i));
        }
        //updating
        numbers.set(1 , 99);
        System.out.println(numbers);
        numbers.remove(1);
        System.out.println(numbers);
        System.out.println(numbers.contains(4));
        System.out.println(numbers.isEmpty());
    }

}

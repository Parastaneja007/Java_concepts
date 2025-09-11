package Collection_framework;

import java.util.*;

public class Array_list {
    public static void main(String[] args) {
        class MyComparator implements Comparator<Integer>{
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1 ; // why - full explanation in n.b
            }
        }
        class StringLengthCompartor implements Comparator<String>{ // for strings logic for order
            @Override
            public int compare(String s1, String s2) {
                 return s1.length() - s2.length(); // for ascending order . for descending s2.length() - s1.length()
            }

        }

        ArrayList<Integer> list = new ArrayList<>(20);
        for(int i = 0 ; i <= 9 ; i++){
            list.add(9 - i);
        }
        System.out.println(list);
        list.remove(Integer.valueOf(1)); // it remove the value 1 not the value at index 1
        System.out.println(list);
        System.out.println(list.size()); // gives the size of array list
        Collections.sort(list); // to sort the list
        list.sort(null); // we can also use this ,ascending order by default
        System.out.println(list);
        List<String> fruits = Arrays.asList("banana" , "apple" , "date");
        fruits.sort(null);
        System.out.println(fruits);
        fruits.sort(new StringLengthCompartor());
        System.out.println(fruits); // ascending order like a , b by default
        // but we want to built custom logic , we can also built using comparator
        // comparator is an interface ,
        ArrayList<Integer> num = new ArrayList<>();
        num.add(2);
        num.add(1);
        num.add(3);
        num.sort(new MyComparator());
        System.out.println(num);
    }

//    class MyComparator implements Comparator<Integer>{
//        @Override
//        public int compare(Integer o1, Integer o2) {
//             return o2 - o1 ; // why - full explanation in n.b
//        }
//    }
    // in the above class we have implemented comparator interface to a class
    // and inside it there is a method compare so we will override that as interfaces are abstract
    // by default


}

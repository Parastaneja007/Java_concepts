package Collection_framework;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
     Vector<Integer> vectors = new Vector<>(5 , 3); // by deafauly 10
        System.out.println(vectors.capacity());// tells the capacity of vector
        vectors.add(1);
        vectors.add(2);
        vectors.add(3);
        vectors.add(4);
        vectors.add(5);
        vectors.add(6);
     System.out.println(vectors.capacity()); // now capacity will be increased by default as arraylist
        // but in arraylist it was 1.5 as the initial capacity , in vector it is 2 times the initial capacity
        // but we want to increment it by a specific number , we can do that also
        // if we remove the cpacity incrementor it will be 10
    }
}

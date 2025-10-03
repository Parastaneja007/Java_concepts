package Collection_framework;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // part of a queue interface
        //order element based on their natural ordering (for primitives lowest first)
        //custom comparator for custom ordering
        // does not allow null elements
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(5);
        pq.add(3);
        pq.add(20);
        System.out.println(pq); // not sorted
        while(!pq.isEmpty()){
            System.out.println(pq.poll()); // sorted 
        }
    }
}

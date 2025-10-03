package Collection_framework;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> dq1 = new ArrayDeque<>();// faster iteration , low memory , no null allowed
        //circular head and tail
        // no need to shift element , just shift head and tail ...
        Deque<Integer> dq2 = new LinkedList<>(); // used when insertion deletion somewhere in middle
        dq1.addFirst(10);
        dq1.addLast(20);
        dq1.offerFirst(5);
        dq1.offerLast(25);
        System.out.println(dq1);
        // 5 ,10 , 20 , 25
        System.out.println(dq1);
        System.out.println("First Element " + dq1.getFirst()); // 5
        System.out.println("Last Element " + dq1.getLast()); // 25
        dq1.removeFirst(); // removes 5
        dq1.pollLast(); // removes 25
        // current deque [ 10 , 20 ]
        for(int nums : dq1){
            System.out.println(nums);
        }
    }
}

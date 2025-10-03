package Collection_framework;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> nums = new LinkedList<>();
        System.out.println(nums.size()); // returns size
//        System.out.println(nums.remove()); // exception as no element is there
        System.out.println(nums.poll()); /// used to remove but no exception when it is empty as
        // it returns null
//        System.out.println(nums.element()); // used to show top element throws exception if empty
        System.out.println(nums.peek());// also used to show top , but no exception if empty
        Queue<Integer> queue1 = new ArrayBlockingQueue<>(2);
        System.out.println(queue1.add(1)); // returns true
        System.out.println(queue1.offer(2)); // same work as add
//        System.out.println(queue1.add(3)); // throws exception as capacity is full
        System.out.println(queue1.offer(3)); // no exception , returns false
    }
}

package Collection_framework;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class LinkedBlockingQueueDemo {
    public static void main(String[] args) {
        BlockingQueue<Integer> bq1 = new LinkedBlockingQueue<>();
        // optional bounded backed by linked list
//        uses two separate locks for enqueue and dequeue operations
        // in ArrayBlockedQueue --
        //bounded queue backed by circular array
        // low memory overhead
        //  uses a single lock for both enqueue and dequeue operations
        // more threads -- > problem
        // higher concurrency between producer and consumer
         // PriorityBoundedQueue
        // binary heap as array and can grow dynamically
        //head is based on their natural ordering or a provided comparator like priority queue
        //unbounded , put won'nt block
        BlockingQueue<Integer> dq2 = new PriorityBlockingQueue<>();
        //SynchronousQueue
        BlockingQueue<Integer> sq = new SynchronousQueue<>();
        // each insert operation must wait for corresponding remove operation
        // it can not store element , capacity at most one element 
    }
}

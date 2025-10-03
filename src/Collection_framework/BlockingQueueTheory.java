package Collection_framework;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueTheory {
    public static void main(String[] args) {
        // Thread safe queue
        // wait for queue to become non empty / or wait for queue for space
        //  simplify concurrency problem like producer consumer
        //standard queue -- immediately
           // empty -- > remove ( no waiting )
           // full -- > add ( no waiting )
        // blocking queue -- wait
           // put -> blocks if  the queue is full until space is available
           // take -> blocks if the queue is empty until element becomes available
           // offer -> wait for the space become available , upto specified timeout
        BlockingQueue<Integer> bq = new ArrayBlockingQueue<>();// a bounded , blocking queue backed by
        // an array
    }
}

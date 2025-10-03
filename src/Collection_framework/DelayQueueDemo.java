package Collection_framework;

import java.util.Queue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueueDemo {
    public static void main(String[] args) {
        //Thread-safe unbounded blocking queue
        // elements can only be taken from the queue when their delay has expired
        // useful for scheduling tasks to be executed after a certain delay
        // internally priority queue
        Queue<DelayedTask> dq1 = new DelayQueue<>();
    }
}
 class DelayedTask implements Delayed{
    private final String taskname ;
    private final long StartTime ;

     public DelayedTask(String taskname, long  delay , TimeUnit unit) {
         this.taskname = taskname;
         StartTime =  System.currentTimeMillis() + unit.toMillis(delay);
     }

     @Override
     public long getDelay(TimeUnit unit) {
         return 0;
     }

     @Override
     public int compareTo(Delayed o) {
         return 0;
     }
 }

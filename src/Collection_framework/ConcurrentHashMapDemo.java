package Collection_framework;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<String , Integer> msp = new ConcurrentHashMap<>();
        // java 7 -- segment based locking -16 segments >> -- smaller hashmaps
        // only the segment being written to or read from is locked .
        // java 8-no segmentation
        // uses compare and swap approach -- no locking except resizing or collision
        // Thread a last saw 45 -- x = 45
        // Thread a work -- x to 50
        // if x is still 45 ,hen change it to 50 else do not change and retry
        //put -- index
        //MAP -- SORTED -- THREAD SAFE -- ConcurrentSkipListMap
    }
}

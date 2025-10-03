package Collection_framework;

public class CopyOnWriteArraySetDemo {
    public static void main(String[] args) {
        //Thread - Safe
        //copy on write mechanism
        // no duplicate elements
        //Iterators do not reflect modification
//        Belongs to java.util.concurrent package.
//
//        Internally backed by a CopyOnWriteArrayList.
//
//                It implements Set interface, so it does not allow duplicate elements.
//
//                Thread-safe because every time you modify (add, remove, etc.), it creates a new copy of the underlying array.
//
//        Read operations are fast (no locking needed).
//
//        Write operations are costly because a new copy of the array is made.
//        Fail-safe iterator: Iterators do not throw ConcurrentModificationException because they operate on a snapshot of the array at the time of creation.
//
//        Best suited when:
//
//        Reads are very frequent.
//
//        Writes (add/remove) are rare.
    }
}

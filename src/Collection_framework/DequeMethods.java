package Collection_framework;

public class DequeMethods {
    public static void main(String[] args) {
        // double ended queue
        // allow insertion and deletion from both ends
//        🔹 Methods in Deque
//
//        Since Deque extends Queue, it has all Queue methods + its own.
//                There are two categories of methods in Deque:
//
//        1. Insertion Methods
//        Method	Description
//        addFirst(E e)	Inserts at the front, throws exception if full.
//                addLast(E e)	Inserts at the end, throws exception if full.
//                offerFirst(E e)	Inserts at the front, returns false if full.
//                offerLast(E e)	Inserts at the end, returns false if full.
//                add(E e)	Inserts at the end (like queue).
//        offer(E e)	Inserts at the end, returns false if fails.
//        2. Deletion Methods
//        Method	Description
//        removeFirst()	Removes and returns the first element, exception if empty.
//                removeLast()	Removes and returns the last element, exception if empty.
//                pollFirst()	Removes and returns the first element, returns null if empty.
//                pollLast()	Removes and returns the last element, returns null if empty.
//                remove()	Removes head (like queue), exception if empty.
//                poll()	Removes head, returns null if empty.
//        3. Access Methods (Peeking)
//                Method	Description
//        getFirst()	Returns first element, exception if empty.
//                getLast()	Returns last element, exception if empty.
//                peekFirst()	Returns first element, null if empty.
//                peekLast()	Returns last element, null if empty.
//                element()	Returns head, exception if empty.
//                peek()	Returns head, null if empty.
//        4. Other Utility Methods
//        Method	Description
//        size()	Returns number of elements.
//        isEmpty()	Checks if deque is empty.
//                contains(Object o)	Checks if element exists.
//        iterator()	Returns iterator from front to end.
//        descendingIterator()	Returns iterator from end to front.
//        clear()	Removes all elements.
    }
}

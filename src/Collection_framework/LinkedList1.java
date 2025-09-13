package Collection_framework;
import java.util.*;
public class LinkedList1 {
    public static void main(String[] args) {
      LinkedList<Integer> linkedlist = new LinkedList<>();
      linkedlist.add(1);
      linkedlist.add(2);
      linkedlist.add(3);
      linkedlist.get(2); //o(n) - complexity
        System.out.println(linkedlist);
        linkedlist.addFirst(5); //o(n)
        linkedlist.addLast(7); //o(1)
        System.out.println(linkedlist);
        linkedlist.removeIf(x -> x%2 == 0 ); // we can pass condition , in this all even number will be
        // removed
        System.out.println(linkedlist);
        LinkedList<String> animals = new LinkedList<>(Arrays.asList("cat" , "dog" , "lion" , "elephant"));
        LinkedList<String> animalsRemove = new LinkedList<>(Arrays.asList("cat" , "lion"));
        animals.removeAll(animalsRemove);
        System.out.println(animals);
    }
}
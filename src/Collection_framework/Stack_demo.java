package Collection_framework;

import java.util.LinkedList;
import java.util.Stack;

public class Stack_demo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
       stack.push(1); // for inserting the elements
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println( stack);
        int removed =  stack.pop(); // for removing the last inserted element or we can say the top element
        System.out.println(stack);
        System.out.println(stack.peek()); // display the top element
        System.out.println(stack.isEmpty()); // shows that stack is empty or not
        System.out.println(stack.size()); // displays the size of stack
        // we can also use vector methods like add , remove as it extends the vector class
        System.out.println(stack.search(1));
        // its starts searching from the top , and its indexing starts from 1 not 0
        //3
        //2
        //1 - finds here , so answer is 3
        // we can also use linked liat as stack
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6); // push
        System.out.println(list);
         list.removeLast();  // pop
        System.out.println(list);
       System.out.println(list.getLast());  //peek
    }
}

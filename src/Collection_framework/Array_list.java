package Collection_framework;

import java.util.ArrayList;
import java.util.Collections;

public class Array_list {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(20);
        for(int i = 0 ; i <= 9 ; i++){
            list.add(9 - i);
        }
        System.out.println(list);
        list.remove(Integer.valueOf(1)); // it remove the value 1 not the value at index 1
        System.out.println(list);
        System.out.println(list.size()); // gives the size of array list
        Collections.sort(list); // to sort the list
        list.sort(null); // we can also use this
        System.out.println(list);
    }

}

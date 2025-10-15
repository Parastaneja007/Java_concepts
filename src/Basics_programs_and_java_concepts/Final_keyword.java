package Basics_programs_and_java_concepts;

import java.lang.reflect.Array;

public class Final_keyword {
    public static void main(String[] args) {
        //prevent the content to be modified
        //to make something constant
        //always initialize while declaring
        // but its value only not change for primitive data types
        // in case of non primitive or objects its value can change but we can not re assign it
        final int BOX = 10; // try to use capital name of variable
//        box = 20; can not modify error
//        System.out.println(box);
       final  int[] arr = new int[3];
        arr[0] = 10 ;
        arr[0] = 11; // we can change the value as object is being created
//        arr = new int[4]; // we can not re assign it
        arr[1] = 14;

        System.out.println(arr[2]);

    }
}

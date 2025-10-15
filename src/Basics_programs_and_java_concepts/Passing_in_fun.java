package Basics_programs_and_java_concepts;

import java.util.Arrays;
import java.util.Scanner;

public class Passing_in_fun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] marks = new int[5];
        for(int i = 0 ; i< marks.length ; i++){
            marks[i]  = input.nextInt();
        }
        change(marks);
        System.out.println(Arrays.toString(marks));
    }
    public static void change(int[] arr){
      arr[0] = 99;
    }
}

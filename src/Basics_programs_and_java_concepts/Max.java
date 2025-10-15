package Basics_programs_and_java_concepts;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner input = new Scanner(System.in);
        for( int i = 0 ; i <= 4 ; i++){
            arr[i] = input.nextInt();
        }
        System.out.println(max(arr));
    }
    public static int max(int[] arr){
        int max_value = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max_value){
                max_value = arr[i];
            }
        }
        return max_value;
    };
}

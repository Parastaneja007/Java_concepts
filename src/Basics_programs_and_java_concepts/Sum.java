package Basics_programs_and_java_concepts;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number 1");
        int num1 = input.nextInt();
        System.out.println("enter number 2");
        int num2 = input.nextInt();
        int sum = num1 + num2 ;
        System.out.println("sum is " + sum);
    }
}


package Basics_programs_and_java_concepts;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your roll number");
        int roll_no = input.nextInt();
        System.out.println("your roll number is " + roll_no);
        int a = 240_000_000;
        System.out.println(a);
    }
}

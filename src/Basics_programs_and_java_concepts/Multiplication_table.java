package Basics_programs_and_java_concepts;

import java.util.Scanner;

public class Multiplication_table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        int n = input.nextInt();
        for(int i = 1; i <=10;i++){
            System.out.println(n*i);
        }
    }
}

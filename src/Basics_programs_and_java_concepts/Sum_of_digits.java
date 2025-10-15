package Basics_programs_and_java_concepts;

import java.util.Scanner;

public class Sum_of_digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int n = input.nextInt();
        int sum = 0 ;
        while(n>0){
            int rem = n % 10 ;
            sum = sum + rem;
            n = n/10;
        }
        System.out.println(sum);

    }
}

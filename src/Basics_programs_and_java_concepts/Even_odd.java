package Basics_programs_and_java_concepts;

import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        int n = input.nextInt();
        if(n%2==0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }

    }
}

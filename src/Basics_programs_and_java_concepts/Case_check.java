package Basics_programs_and_java_concepts;

import java.util.Scanner;

public class Case_check {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
        if (ch >= 'a' && ch<='z'){
            System.out.println("lower case");
        }
        else{
            System.out.println("upper case");
        }
    }
}

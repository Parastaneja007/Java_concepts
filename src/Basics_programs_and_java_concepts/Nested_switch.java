package Basics_programs_and_java_concepts;

import java.util.Scanner;

public class Nested_switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your branch CSE  OR ECE");
        String branch = input.next();
        System.out.println("enter the year 1 ,2 ,3 , or 4 ");
        int year = input.nextInt();
        switch(branch){
            case "cse":
                switch(year){
                    case 1 :
                        System.out.println("subjects are math,physics,chemistry,c");
                        break;
                    case 2 :
                        System.out.println("subjects are dbms ,math,python");
                        break;
                    case 3 :
                        System.out.println("subjects are os , oops , c++ , math");
                        break;
                    case 4 :
                        System.out.println("fla,java,system design");
                        break;
                    default:
                        System.out.println("enter valid year");
                }
                break;
            case "ece":
                switch (year){
                    case 1 :
                        System.out.println("physics ,chemistry , math");
                        break;
                    case 2 :
                        System.out.println("de , electric circuits ,maths");
                        break;
                    case 3 :
                        System.out.println("electromagnetic waves, control systems");
                        break;
                    case 4 :
                        System.out.println(" Digital Audio Processing, Antennas and Propagation, Wireless Sensor Networks");
                        break;
                    default:
                        System.out.println("invalid yaar");
                }
                break;
            default:
                System.out.println("invalid branch");
        }
    }
}

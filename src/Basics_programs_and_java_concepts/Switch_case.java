package Basics_programs_and_java_concepts;

import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("enter fruit");
//        String fruit = input.next();
//        switch (fruit){
//            case "mango":
//                System.out.println("king of fruits");
//                break;
//            case "apple":
//                System.out.println("red fruit");
//                break;
//            case "grapes":
//                System.out.println("small fruit");
//                break;
//            default:
//                System.out.println("enter another fruit");
//
//
//        }
//        Scanner input = new Scanner(System.in);
//        System.out.println("enter fruit");
//        String fruit = input.next();
//        switch(fruit){
//            case "mango"-> System.out.println("king of fruit");
//            case "apple"-> System.out.println("red fruit");
//            case "grapes"->System.out.println("small fruit");
//            default -> System.out.println("enter another");
//        }
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
//        switch(n){
//            case 1 -> System.out.println("monday");
//            case 2 -> System.out.println("tuesday");
//            case 3 -> System.out.println("wednesday");
//            case 4 -> System.out.println("thursday");
//            case 5 -> System.out.println("friday");
//            case 6 -> System.out.println("saturday");
//            case 7 -> System.out.println("sunday");
//            default -> System.out.println("no match");
//
//        }
        switch (n) {
            case 1, 2, 3, 4, 5 -> System.out.println("weekdays");
            case 6, 7 -> System.out.println("weekends");
        }
//        switch (n) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("weekdays");
//                break;
//            case 6:
//            case 7:
//                System.out.println("weekends");
//                break;
//        }

    }
}

package Basics_programs_and_java_concepts;

import java.util.Scanner;

public class Vid09_condition {
    public static void main(String[] args) {
        /*
        syntax of if-else
        if(boolean expression T or F){
         do this
         }
         else{
         do this
         }
         */
        Scanner input = new Scanner(System.in);
        System.out.println("enter your salary");
        int salary =  input.nextInt();
//        if (salary > 10000){
//            salary = salary + 2000;
//        }
//        else{
//            salary = salary + 1000;
//        }
//        System.out.println(salary);
        //multiple if-else
        if (salary>15000){
            salary+=2500;
        }
        else if (salary>10000){
            salary+=2000;
        }
        else{
            salary+=1000;
        }
        System.out.println(salary);
    }
}

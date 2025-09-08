package Basics_programs_and_java_concepts;

import java.util.Scanner;

public class Calculator_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("enter the operator");
//        char op = input.next().trim().charAt(0);
        int ans = 0;
        while(true){
//
            System.out.println("enter the operator");
            char op = input.next().trim().charAt(0);
            if(op=='x'){
                break;
            }
//            System.out.println("enter the opeator");
            if( op =='+' || op =='-' || op=='*' || op=='/' || op =='%'){
                System.out.println("enter two number");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                if(op=='+'){
                    ans = num1 + num2;
                    System.out.println(ans);
                } else if (op=='*') {
                    ans = num1 * num2;
                    System.out.println(ans);

                } else if (op=='-') {
                    ans = num1 - num2;
                    System.out.println(ans);

                } else if (op=='/') {
//                    ans=num1/num2;
                    if(num2!=0){
                        ans=num1/num2;
                     System.out.println(ans);
                    }
                    else {
                     System.out.println("divisible by zero not possible");
                    }
                } else if (op=='%') {
                    if(num2!=0){
                        ans = num1 % num2 ;
                        System.out.println(ans);
                    }else {
                        System.out.println("can not find by 0");
                    }

                }



                }
            else{
                System.out.println("invaid operator");
            }


            }
        }
    }


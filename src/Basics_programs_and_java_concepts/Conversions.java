package Basics_programs_and_java_concepts;

import java.util.Scanner;

public class Conversions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //type converstion
//        int num = input.nextInt();
//        System.out.println(num);
        //error if we provide float value because float s greater than int and we are trying to convert float to int
//        float marks = input.nextFloat();
//        System.out.println(marks);
        //no error if we provide int . it will be automatically converted into float as int as smaller than float
        //Type casting
//        float num = input.nextFloat();
//        System.out.println((int)(num));
        //type promotion
//        byte a = 40;
//        byte b = 50;
//        int c = a * b;
//        System.out.println(c);
//        int a = 258;
//        byte b = (byte)(a);
//        System.out.println(b);
        int number= 'A';
        System.out.println(number);

    }
}

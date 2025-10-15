package Basics_programs_and_java_concepts;

import java.util.Scanner;

public class Meathods_functions {
    // 1st add (without void and without parameters )
    public static int add(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter number 1");
        int x = input.nextInt();
        System.out.println("enter number 2");
        int y = input.nextInt();
        int sum = x + y;
        return sum;
    }
    // 2nd ( with void )
    public static void add2(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter number 1");
        int x = input.nextInt();
        System.out.println("enter number 2");
        int y = input.nextInt();
        int sum = x + y;
        System.out.println(sum);

    }
    // 3rd (with parameter)
    public static int add3(int x , int y){
        int sum = x + y;
        return sum;

    }
    // 4th greeting
    public static void greet(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.next();
        System.out.println("hello " + name);
    }
    // 5th greeting with parameters
    public static void  greet2(String name){
        System.out.println(" Hello " + name);
    }
    //6th greeting with return type
    public static String  greet3(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter your name");
        String name = input.next();
        String s = "hello " + name;
        return s ;
    }
    // 7 th Basics_programs_and_java_concepts.Swap
    public static void swap() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number 1");
        int a = input.nextInt();
        System.out.println("enter number 2");
        int b = input.nextInt();
        int temp = a;
        a = b ;
        b = temp;
        System.out.println("The number are swapped");
        System.out.println("The number 1 is " + a);
        System.out.println("The number 2 is " + b);
    }
    // 8th Basics_programs_and_java_concepts.Swap with parameters
    public static void swap1(int a , int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " +  b);
        // this change will be valid in this function scope only
    }
    //meathod overloading - same meathod name with different parameters
    public static double add3(double x , double y){
        double sum = x + y;
        return sum;
    }




    public static void main(String[] args) {
        //1st meathod
//         System.out.println(add());
        //2nd meathod
//       int result =  add();
//       System.out.println(result);
//       add2();
//       int ans = add3(10,35);
//       System.out.println(ans);
//        greet();
//        greet2("paras");
//        System.out.println(add3(2.3,2.4));
//        Basics_programs_and_java_concepts.Meathods_functions.greet();
//        System.out.println(greet3());
//        swap();
        swap1(20,42);


    }
}

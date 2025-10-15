package Basics_programs_and_java_concepts;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//        int i = 1;
//        while (i <= 5) {
//            System.out.println(i);
//             i++;
//        }
//        for(int i=1 ;i<=5;i++){
//            System.out.println(i);
//        }
        //password checker using while(because we dont know how many times loop will work
        Scanner input = new Scanner(System.in);
        String password ="";
        while(!password.equals("paras007")){
            System.out.println("enter password");
            password = input.nextLine();
        }
        System.out.println("access granted");
    }
}

package Basics_programs_and_java_concepts;

import java.util.ArrayList;
import java.util.Scanner;

public class Grocery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many types of items you want in your store");
        int items = input.nextInt();
        ArrayList<ArrayList<String>> Grocery = new ArrayList<>();
        for( int i = 0 ; i < items ; i++){
            Grocery.add( new ArrayList<>() );
            System.out.println("Number of things in " + ( i + 1) + " item");
            int things = input.nextInt();
            for( int j = 0 ; j < things ; j ++){
                Grocery.get(i).add(input.next());
            }
        }
        System.out.println(Grocery);
    }
}

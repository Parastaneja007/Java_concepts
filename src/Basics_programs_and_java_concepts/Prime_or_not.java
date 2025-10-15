package Basics_programs_and_java_concepts;

import java.util.Scanner;

public class Prime_or_not {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count=0;
        for(int i=1;i<=n ; i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("prime");
        }
        else{
            System.out.println("non prime");
        }
    }
}

package Basics_programs_and_java_concepts;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int ans = 0;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("enter a digit number you want to check");
        int n = input.nextInt();
        int an = n;
        int cn = n;
        while(cn>0){
            int c = cn % 10;
            count++;
            cn = cn/10;
        }
        while(an>0){
            int rem = an%10;
            ans = (ans)  + (int)(Math.pow(rem , count));
            // we have converted into int because by deafault math.pow is in double
            // math.pow(base , exponent)
            an = an/10;
        }
        if(n == ans){
            System.out.println("armstrong number");
        }
        else{
            System.out.println("not armstrong ");
        }


    }
}

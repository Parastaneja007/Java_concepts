package Basics_programs_and_java_concepts;

import java.util.Scanner;

public class All_Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number to check");
        int n = input.nextInt();
        System.out.println(IsArmstrong(n));
        for(int i = 1; i <= 100000; i++){
            if(IsArmstrong(i)){
                System.out.println(i);
            }
        }
        
    }
    public static boolean IsArmstrong(int n){
        int ans = 0;
        int count = 0;
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
            return true;
        }
        else{
            return false;
        }

    }
}

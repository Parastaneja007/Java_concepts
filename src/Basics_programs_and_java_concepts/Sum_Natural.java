package Basics_programs_and_java_concepts;

import java.util.Scanner;

public class Sum_Natural {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int ans = 0;
        for(int i = 1 ; i<=n ; i++){
            ans=i+ans;
        }
        System.out.println(ans);
    }
}

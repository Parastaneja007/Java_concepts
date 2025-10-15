package Basics_programs_and_java_concepts;

import java.util.Scanner;

public class PalidromePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string you want to check");
        String s = input.nextLine().toLowerCase().replaceAll("[^a-z]" , "");
        boolean IsPalindrome = true;
        int start = 0;
        int end = s.length() - 1 ;
        while(start<end){
            if(s.charAt(start) != s.charAt(end)){
                IsPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if(IsPalindrome){
            System.out.println("string is palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}

import java.util.Scanner;

public class Palidrome {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the string you want to check");
//        String orignal = input.next();
//        StringBuilder s = new StringBuilder(orignal);
//        String reverse = s.reverse().toString();
//        if(orignal.equals(reverse)){
//            System.out.println("palidrome");
//        }
//        else {
//            System.out.println("not palidrome");
//        }
//
        // chat gpt approach - good one , read carefully



                Scanner input = new Scanner(System.in);
                System.out.print("Enter a string: ");
                String original = input.nextLine().toLowerCase().replaceAll("[^a-z]", ""); // Clean input

                boolean isPalindrome = true;
                int start = 0;
                int end = original.length() - 1;

                while (start < end) {
                    if (original.charAt(start) != original.charAt(end)) {
                        isPalindrome = false;
                        break;
                    }
                    start++;
                    end--;
                }

                if (isPalindrome) {
                    System.out.println("String is palindrome");
                } else {
                    System.out.println("Not palindrome");
                }

                input.close();
            }
        }



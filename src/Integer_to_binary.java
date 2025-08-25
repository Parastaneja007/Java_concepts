import java.util.Scanner;

public class Integer_to_binary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        int n = input.nextInt();
        System.out.println("Binary is " + Integer.toBinaryString(n));

    }

}

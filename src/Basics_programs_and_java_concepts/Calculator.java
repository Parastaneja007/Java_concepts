import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            // Ask for the operation
            System.out.print("Enter operation (+, -, *, /, %, x to exit): ");
            char op = input.next().trim().charAt(0);

            // Exit condition
            if (op == 'x' || op == 'X') {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            // Check for valid operations
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // Ask for two numbers
                System.out.print("Enter first number: ");
                double num1 = input.nextDouble();

                System.out.print("Enter second number: ");
                double num2 = input.nextDouble();

                // Perform the operation using if-else
                if (op == '+') {
                    System.out.println("Result: " + (num1 + num2));
                } else if (op == '-') {
                    System.out.println("Result: " + (num1 - num2));
                } else if (op == '*') {
                    System.out.println("Result: " + (num1 * num2));
                } else if (op == '/') {
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Error: Division by zero!");
                    }
                } else if (op == '%') {
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 % num2));
                    } else {
                        System.out.println("Error: Modulo by zero!");
                    }
                }
            } else {
                // Invalid operation
                System.out.println("Invalid operation!");
            }

//            System.out.println(); // blank line for spacing
        }

    }
}


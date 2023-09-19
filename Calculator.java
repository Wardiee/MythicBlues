import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Calculator!");
        System.out.println("Please enter two numbers:");

        // Read input
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        System.out.println("Select an operation (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        double result;

        // Perform calculation
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero");
                    return; // Exit program if division by zero
                }
                break;
            default:
                System.out.println("Invalid operator");
                return; // Exit program for invalid operator
        }

        System.out.println("Result: " + result);
    }
}

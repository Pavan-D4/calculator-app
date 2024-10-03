import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Create a scanner object for input 
        Scanner scanner = new Scanner(System.in);

        // Get user input for the first number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        // Get user input for the second number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Get user input for the operator
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // Perform the chosen operation and display the result
        switch (operator) {
            case '+':
                System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, num1 + num2);
                break;
            case '-':
                System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, num1 - num2);
                break;
            case '*':
                System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, num1 * num2);
                break;
            case '/':
                if (num2 != 0) {
                    System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, num1 / num2);
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }

        // Close the scanner
        scanner.close();
    }
}


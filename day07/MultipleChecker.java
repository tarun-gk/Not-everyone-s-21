
import java.util.Scanner;

public class MultipleChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        // Handle division by zero edge case
        if (num1 == 0 || num2 == 0) {
            System.out.println("Division by zero is not allowed.");
        } else if (num1 % num2 == 0) {
            System.out.println(num1 + " is a multiple of " + num2 + ".");
        } else if (num2 % num1 == 0) {
            System.out.println(num2 + " is a multiple of " + num1 + ".");
        } else {
            System.out.println("Neither number is a multiple of the other.");
        }
        
        scanner.close();
    }
}

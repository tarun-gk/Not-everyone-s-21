import java.util.Scanner;

public class CharacterCheck {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a single character: ");
        
        // Read the first character of the entered string
        char ch = scanner.next().charAt(0);
        
        // Check character type using built-in methods
        if (Character.isUpperCase(ch)) {
            System.out.println(ch + " is an uppercase letter.");
        } else if (Character.isLowerCase(ch)) {
            System.out.println(ch + " is a lowercase letter.");
        } else if (Character.isDigit(ch)) {
            System.out.println(ch + " is a digit.");
        } else {
            System.out.println(ch + " is a special character.");
        }
        
        // Close the scanner resource
        scanner.close();
    }
}

import java.util.Scanner;

public class Digitcheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a 4-digit number: ");
        int number = scanner.nextInt();
        
        
        if (number >= 1000 && number <= 9999) {
            int lastDigit = number % 10;
            int firstDigit = number / 1000;
            
            if (firstDigit == lastDigit) {
                System.out.println("The first and last digits are equal.");
            } else {
                System.out.println("The first and last digits are not equal.");
            }
        } else {
            System.out.println("Error: Please enter a valid 4-digit number.");
        }
        
        scanner.close();
    }
}

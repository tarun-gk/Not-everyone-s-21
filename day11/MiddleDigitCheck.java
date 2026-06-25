
import java.util.Scanner;

public class MiddleDigitCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a 3-digit number: ");
        int number = scanner.nextInt();
        
        if (number < 100 || number > 999) {
            System.out.println("Please enter a valid 3-digit number.");
        } else {
            int first = number / 100;
            int middle = (number / 10) % 10;
            int last = number % 10;
            
          
            if (middle > first && middle > last) {
                System.out.println("The middle digit is the largest.");
            } else if (middle < first && middle < last) {
                System.out.println("The middle digit is the smallest.");
            } else {
                System.out.println("The middle digit is neither the largest nor the smallest.");
            }
        }
        
        scanner.close();
    }
}


import java.util.Scanner;

public class DistinctDigits {
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
            
            if (first != middle && middle != last && first != last) {
                System.out.println("All digits are distinct.");
            } else {
                System.out.println("Digits are not distinct.");
            }
        }
        
        scanner.close();
    }
}

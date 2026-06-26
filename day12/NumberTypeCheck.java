import java.util.Scanner;

public class NumberTypeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        
        int absNumber = Math.abs(number);
        
        if (absNumber >= 0 && absNumber <= 9) {
            System.out.println(number + " is a single-digit number.");
        } else if (absNumber >= 10 && absNumber <= 99) {
            System.out.println(number + " is a double-digit number.");
        } else {
            System.out.println(number + " is a multi-digit number.");
        }
        
        scanner.close();
    }
}

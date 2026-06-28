import java.util.Scanner;

public class RangeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check if the number is within the inclusive range [100, 999]
        if (number >= 100 && number <= 999) {
            System.out.println("The number " + number + " lies within the range [100, 999].");
        } else {
            System.out.println("The number " + number + " does NOT lie within the range [100, 999].");
        }
        
        scanner.close();
    }
}


import java.util.Scanner;

public class AlphabetChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an alphabet character: ");
        char input = scanner.next().charAt(0);
        
        char lowerInput = Character.toLowerCase(input);
        
      
        if (lowerInput >= 'a' && lowerInput <= 'm') {
            System.out.println(input + " lies between 'a' and 'm'.");
        } else if (lowerInput >= 'n' && lowerInput <= 'z') {
            System.out.println(input + " lies between 'n' and 'z'.");
        } else {
            System.out.println(input + " is not a valid alphabet character.");
        }
        
        scanner.close();
    }
}

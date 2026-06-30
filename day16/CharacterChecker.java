import java.util.Scanner;

public class CharacterChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        String input = scanner.next();
        
       
        if (input.length() != 1) {
            System.out.println("Please enter exactly one character.");
        } else {
            char ch = input.charAt(0);
            
    
            if (Character.isLetter(ch)) {
                System.out.println("'" + ch + "' is a letter.");
            } else if (Character.isDigit(ch)) {
                System.out.println("'" + ch + "' is a digit.");
            } else {
                System.out.println("'" + ch + "' is neither a letter nor a digit.");
            }
        }
        
        scanner.close();
    }
}

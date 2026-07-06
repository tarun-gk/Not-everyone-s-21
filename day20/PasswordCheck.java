import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a password to check: ");
        String password = scanner.nextLine();


        boolean hasRightLength = password.length() >= 8;
        boolean hasNumber = false;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                hasNumber = true;
                break; 
            }
        }

        if (hasRightLength && hasNumber) {
            System.out.println("Strong password! It meets all the rules.");
        } else {
            System.out.println("Weak password. It must be 8+ characters long and have a number.");
        }

        scanner.close();
    }
}

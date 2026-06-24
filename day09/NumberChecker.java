
import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
   
        boolean isNum1Even = (num1 % 2 == 0);
        boolean isNum2Even = (num2 % 2 == 0);
        
       
        if (isNum1Even && isNum2Even) {
            System.out.println("Both numbers are even.");
        } else if (!isNum1Even && !isNum2Even) {
            System.out.println("Both numbers are odd.");
        } else {
            System.out.println("One is even and one is odd.");
        }
        
        scanner.close();
    }
}

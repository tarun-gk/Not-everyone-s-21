
import java.util.Scanner;

public class SimpleNumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        
        int positiveNum = Math.abs(num);
        
        if (positiveNum % 7 == 0 || positiveNum % 10 == 7) {
            System.out.println("Yes, matches condition!");
        } else {
            System.out.println("No, does not match.");
        }
        
        input.close();
    }
}

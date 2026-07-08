
import java.util.Scanner;

public class DateValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day: ");
        int day = scanner.nextInt();

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        boolean isValid = false;

        if (month >= 1 && month <= 12) {
            int maxDays = 0;

            
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    maxDays = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    maxDays = 30;
                    break;
                case 2:
                    maxDays = 28; 
                    break;
            }

         
            if (day >= 1 && day <= maxDays) {
                isValid = true;
            }
        }

        if (isValid) {
            System.out.println("Valid date.");
        } else {
            System.out.println("Invalid date.");
        }

        scanner.close();
    }
}

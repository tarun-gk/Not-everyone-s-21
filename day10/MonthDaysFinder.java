
import java.util.Scanner;

public class MonthDaysFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        int month = scanner.nextInt();

        int days = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28; 
            default -> -1; 
        };

        if (days == -1) {
            System.out.println("Invalid month number! Please enter 1 to 12.");
        } else {
            System.out.println("Number of days: " + days);
        }

        scanner.close();
    }
}

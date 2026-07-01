import java.util.Scanner;

public class TimePeriod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hours (0-23): ");
        int hours = scanner.nextInt();
        System.out.print("Enter minutes (0-59): ");
        int minutes = scanner.nextInt();

        if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59) {
            System.out.println("Invalid time entered.");
        } else {
           
            if (hours < 12) {
                System.out.println("AM");
            } else {
                System.out.println("PM");
            }
        }

        scanner.close();
    }
}

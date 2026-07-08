
import java.util.Scanner;

public class ClockAngle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hours (0-23): ");
        int hours = scanner.nextInt();

        System.out.print("Enter minutes (0-59): ");
        int minutes = scanner.nextInt();

        int h = hours % 12;

       
        double minuteAngle = minutes * 6;

      
        double hourAngle = (h * 30) + (minutes * 0.5);

        
        double angle = Math.abs(hourAngle - minuteAngle);

        double smallerAngle = Math.min(angle, 360 - angle);

        System.out.println("The smaller angle is: " + smallerAngle + " degrees");

        scanner.close();
    }
}

import java.util.Scanner;

public class DayTypeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
       
        System.out.print("Enter a weekday number (1-7): ");
        int day = input.nextInt();
        
        
        if (day >= 1 && day <= 5) {
            System.out.println("It is a Weekday.");
        } else if (day == 6 || day == 7) {
            System.out.println("It is the Weekend.");
        } else {
            System.out.println("Invalid day! Please enter a number between 1 and 7.");
        }
        
        input.close();
    }
}

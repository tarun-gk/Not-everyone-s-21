import java.util.Scanner;

public class CurrencyCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();
        

        if (amount >= 100 && amount % 100 == 0) {
            System.out.println("Yes, the amount can be evenly divided into 2000, 500, and 100 notes.");
            
           
            int notes2000 = amount / 2000;
            amount %= 2000;
            
            int notes500 = amount / 500;
            amount %= 500;
            
            int notes100 = amount / 100;
            
            System.out.println("Breakdown: ");
            System.out.println("2000 Notes: " + notes2000);
            System.out.println("500 Notes: " + notes500);
            System.out.println("100 Notes: " + notes100);
        } else {
            System.out.println("No, the amount cannot be evenly divided into 2000, 500, and 100 notes.");
        }
        
        scanner.close();
    }
}

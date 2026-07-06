

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of electricity units consumed: ");
        double units = scanner.nextDouble();
        double bill = 0;

        
        if (units <= 100) {
            bill = units * 4.0; 
        } else if (units <= 300) {
            bill = (100 * 4.0) + ((units - 100) * 6.0); 
        } else {
            bill = (100 * 4.0) + (200 * 6.0) + ((units - 300) * 9.0); 
        }

        System.out.printf("Your total electricity bill is: $%.2f\n", bill);
        scanner.close();
    }
}


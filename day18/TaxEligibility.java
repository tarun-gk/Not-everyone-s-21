import java.util.Scanner;

public class TaxEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter income (in Lakhs, e.g., 5.5): ");
        double income = sc.nextDouble();
        
        if (age > 18 && income > 5.0) {
            System.out.println("Eligible for tax.");
        } else {
            System.out.println("Not eligible for tax.");
        }
        
        sc.close();
    }
}

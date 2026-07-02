

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        // Check if both are positive and their sum is less than 100
        if (num1 > 0 && num2 > 0 && (num1 + num2) < 100) {
            System.out.println("Condition satisfied: Both are positive and sum is less than 100.");
        } else {
            System.out.println("Condition not satisfied.");
        }
        
        sc.close();
    }
}

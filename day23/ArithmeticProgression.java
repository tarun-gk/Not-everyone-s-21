import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        System.out.print("Enter third number: ");
        double c = scanner.nextDouble();

        
        if ((b - a) == (c - b)) {
            System.out.println("The numbers are in Arithmetic Progression.");
        } else {
            System.out.println("The numbers are NOT in Arithmetic Progression.");
        }
        
        scanner.close();
    }
}

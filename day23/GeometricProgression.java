import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        System.out.print("Enter third number: ");
        double c = scanner.nextDouble();

        if ((b * b) == (a * c)) {
            System.out.println("The numbers are in Geometric Progression.");
        } else {
            System.out.println("The numbers are NOT in Geometric Progression.");
        }

        scanner.close();
    }
}

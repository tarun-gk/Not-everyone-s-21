
import java.util.Scanner;

public class PythagoreanTriplet {

    public static boolean isPythagoreanTriplet(int a, int b, int c) {
       
        int sqA = a * a;
        int sqB = b * b;
        int sqC = c * c;

       
        return (sqA + sqB == sqC) || (sqA + sqC == sqB) || (sqB + sqC == sqA);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (isPythagoreanTriplet(a, b, c)) {
            System.out.println("Yes, they form a Pythagorean triplet.");
        } else {
            System.out.println("No, they do not form a Pythagorean triplet.");
        }

        sc.close();
    }
}

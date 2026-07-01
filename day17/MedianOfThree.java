import java.util.Scanner;

public class MedianOfThree{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int median;

       
        if ((a >= b && a <= c) || (a <= b && a >= c)) {
            median = a;
        }
   
        else if ((b >= a && b <= c) || (b <= a && b >= c)) {
            median = b;
        }
     
        else {
            median = c;
        }

        System.out.println("The median value is: " + median);
        scanner.close();
    }
}

import java.util.Scanner;

public class PerfectSquareChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        boolean isPerfectSquare = false;
        
        // Edge case for 0 or 1
        if (num == 0 || num == 1) {
            isPerfectSquare = true;
        } else {
           
            for (int i = 1; i <= num / 2; i++) {
                if (i * i == num) {
                    isPerfectSquare = true;
                    break;
                }
                if (i * i > num) {
                    break;
                }
            }
        }
        
        if (isPerfectSquare) {
            System.out.println(num + " is a perfect square.");
        } else {
            System.out.println(num + " is NOT a perfect square.");
        }
        sc.close();
    }
}

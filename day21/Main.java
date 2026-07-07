
import java.util.Scanner;

public class Main {

    public static void checkPosition(int x, int y) {
        if (x == 0 && y == 0) {
            System.out.println("The point is at the origin.");
        } else if (y == 0) {
            System.out.println("The point lies on the X-axis.");
        } else if (x == 0) {
            System.out.println("The point lies on the Y-axis.");
        } else {
            System.out.println("The point lies in a quadrant.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter coordinate x: ");
        int x = sc.nextInt();
        
        System.out.print("Enter coordinate y: ");
        int y = sc.nextInt();
        
        checkPosition(x, y);
        
        sc.close();
    }
}

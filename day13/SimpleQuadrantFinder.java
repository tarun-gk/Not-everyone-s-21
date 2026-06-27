
import java.util.Scanner;

public class SimpleQuadrantFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter X coordinate: ");
        int x = input.nextInt();
        
        System.out.print("Enter Y coordinate: ");
        int y = input.nextInt();
        
        if (x > 0 && y > 0) {
            System.out.println("Quadrant 1");
        } else if (x < 0 && y > 0) {
            System.out.println("Quadrant 2");
        } else if (x < 0 && y < 0) {
            System.out.println("Quadrant 3");
        } else if (x > 0 && y < 0) {
            System.out.println("Quadrant 4");
        } else {
            System.out.println("On an axis or origin");
        }
        
        input.close();
    }
}

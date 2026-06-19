import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        
       
        char lowerCh = Character.toLowerCase(ch);

        if (Character.isLetter(lowerCh)) {
            switch (lowerCh) {
                case 'a', 'e', 'i', 'o', 'u' -> System.out.println(ch + " is a Vowel.");
                default -> System.out.println(ch + " is a Consonant.");
            }
        } else {
            System.out.println("Invalid input.");
        }
        scanner.close();
    }
}

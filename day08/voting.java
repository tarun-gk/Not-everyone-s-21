
import java.util.Scanner;
public class voting {
    public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("Eligible for voting");
        }
        else if(age>100){
            System.out.println("Enter a Valid age");

        }
        else
        {
            System.out.println("Not Eligible for voting");
        }
        sc.close();
    }
    
}

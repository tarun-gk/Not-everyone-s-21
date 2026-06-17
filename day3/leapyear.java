
import java.util.Scanner;
public class leapyear {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Year");
        int n=sc.nextInt();
        sc.close();
        if((n%400==0||n%100 !=0)&&(n%4==0)){
            System.out.println("true");
        }
        else{
            System.out.println("not a leap year");
        }

    }

    
}

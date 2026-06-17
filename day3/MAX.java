import java.util.Scanner;

public class MAX {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a");
        int a=sc.nextInt();
        System.out.println("enter b");
        int b=sc.nextInt();
        sc.close();
        if(a>b){
            System.out.println("max"+a);
        }
        else
            System.out.println("max"+b);
    }
    
}

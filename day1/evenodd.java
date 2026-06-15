
import java.util.Scanner;
class evenodd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        sc.close();
        if(n%2==0){
            System.out.println("EVEN");

        }
        else {
            System.out.println("ODD");
        }

    }
}
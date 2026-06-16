
import java.util.*;
public class div5 {
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter your number pls");
        int n=sc.nextInt();
        sc.close();
        if(n%5==0){
            System.out.println("div by 5");
        }else{
            System.out.println("not div 5");
        }

    }
    
}

import java.util.*;
public class div3and5 {
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter your number pls");
        int n=sc.nextInt();
        sc.close();
        if(n%5==0 && n%3==0){
            System.out.println("div by 5 and 3");
        }else{
            System.out.println("not div 5 and 3");
        }

    }
    
}
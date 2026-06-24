
import java.util.Scanner;
public class hour{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the hour:");
        int hour=sc.nextInt();
    if(hour<=11){
        System.out.println("Good Morning");
    }
    else if(hour>=12 && hour<=15){
        System.out.println("Good Afternoon");
    }
    else if(hour>=16 && hour<=19){
        System.out.println("Good Evening");
    }
    else if(hour>=20 && hour<=23){
        System.out.println("Good Nigth");
    }
    else{
        System.out.println("enter valid hour!");
    }
    sc.close();
    }
}


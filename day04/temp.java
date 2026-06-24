
import java.util.Scanner;

public class temp {
      public static void main(String[] var0) {
      Scanner var = new Scanner(System.in);
      System.out.println("Enter the current temperature");
      int temo=var.nextInt();
      if(temo>=0 && temo<=15){
        System.out.println("COLD");
      
      }
      else if(temo>15 && temo<=28){
        System.out.println("Warm");
      }
      else if(temo>28){
        System.out.println("Hot");
      }
      else{
        System.out.println("Freezing");
      }
      var.close();
     }
}

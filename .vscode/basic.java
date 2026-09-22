import java.util.*;

public class basic {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     System.out.println("Enter a number:");
     if(n < 0){
         System.out.println("negative number");
     }
     else if(n > 0){
         System.out.println("positive number");

     }
     else{
         System.out.println("zero");
     }

    }
}
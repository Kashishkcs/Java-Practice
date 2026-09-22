 import java.util.*;

public class pro1{
  
  /* public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     //	Take a number and print whether it’s positive, negative, or zero.//
      System.out.println("Enter a number:");
        int n = sc.nextInt();

     if(n < 0){
         System.out.println("negative number");
     }
     else if(n > 0){
         System.out.println("positive number");

     }
     else{
         System.out.println("zero");
     }

    }*/

     //	Check if a number is even or odd.//
     /*public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if(n % 2 == 0){
            System.out.println("even number:");
        } else{
            System.out.println("Odd number");
        }
     }*/




        //	Check if a number is divisible by 5

/*public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if(n % 5 == 0){
            System.out.println("divisible by 5");
        }else{
            System.out.println("not divisible by 5");
        }
    }
*/
    //	Check if a number is divisible by both 3 and 5.
  /*  public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if(n % 15 == 0){
            System.out.println("IT is divisible by 3 and 5 both");
        } else{
            System.out.println("not divisible by 3 and 5");
        }
    }

*/


    // leap year//
   /*
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

    if(n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
    System.out.println("Leap Year");
} else {
    System.out.println("Not a Leap Year");
}
}
    

}
*/
// Take two numbers and print the larger one.
/* 
public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int n = sc.nextInt();
         System.out.println("Enter 2nd number:");
        int m = sc.nextInt();
        if(m > n){
             System.out.println( m  +  " is larger:");
        }
        else{
             System.out.println( n  +  " is larger:");
        }
        
        }
    }
      */  
     // Take three numbers and print the largest.

     /* 
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int n = sc.nextInt();
         System.out.println("Enter 2nd number:");
        int m = sc.nextInt();
         System.out.println("Enter 3nd number:");
        int t = sc.nextInt();
        if(m > n && m > t){
            System.out.println("largest number is : " + m);

        }
        else if(n > m && n > t){
           System.out.println("largest number is : " + n);
  
        }
        else{
             System.out.println("largest number is : " + t);

        }
    }
}
*/



//  Take a temperature value and print “Cold”, “Warm”, or “Hot” using range conditions.
/* 
       public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temp:");
        int n = sc.nextInt(); 
        if(  n < 30){
        System.out.println( n + " temp is cold");
        }
       else if (n > 30 && n < 50){
            System.out.println( n + " temp is warm"); 
        }
        else{

         System.out.println(  n  + " temp is hot");
        }
    }
}
    */
   //  Take a character and check if it’s a vowel or consonant. 
   /*  
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character:");
        char c = sc.next().charAt(0);
        if(c =='a' || c =='e' || c =='i' || c =='o' || c == 'u' || c =='A' || c =='E' ||c =='I' ||c =='O' ||c =='U'){
            System.out.println("the character is vowel");
        }
        else{
             System.out.println("the character is constant");
        }
    }
}
*/
// Take a character and check whether it’s uppercase, lowercase, a digit, or a special 
//character.
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character:");
         char c = sc.next().charAt(0);
         if(c >= 'a' && c <= 'z'){
            System.out.println("lowercase"); 
         }
         else if(c >= 'A' && c <= 'Z'){
             System.out.println("Uppercase");
         }
         else if(c >= '0' && c <= '9'){
             System.out.println("Digit");
         }
         else{
             System.out.println("Special character");
         }
        }
    }
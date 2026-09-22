import java.util.*;

 public class basic {

   // Take a number and print whether it’s positive, negative, or zero.
//     public static void main(String[] args){
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter a number");
//    int n = sc.nextInt();
//    if(n > 0){
//     System.out.println("positive");
//    }
//    else if(n < 0){
//      System.out.println("negative");
//    }
//    else{
//      System.out.println("Zero");
//    }

       
//     }
// }

//Check if a number is even or odd. 
//      public static void main(String[] args){
//    Scanner sc = new Scanner(System.in);
//     System.out.println("Enter a number");
//    int n = sc.nextInt();
//    if(n%2 == 0){
//     System.out.println("even");
//    }
//    else{
//     System.out.println("odd");
//    }
// }
//  }


 //Check if a number is divisible by 5. 
//  public static void main(String[] args){
//   Scanner sc = new Scanner(System.in);
//      System.out.println("Enter a number");
//     int n = sc.nextInt();
//     if(n%5 == 0){
//         System.out.println("Divisible by 5");
//     }
//     else{
//          System.out.println(" not Divisible by 5");
//     }
// }
//  }

 // Check if a number is divisible by both 3 and 5. 
// public static void main(String[] args){
//   Scanner sc = new Scanner(System.in);
//      System.out.println("Enter a number");
//     int n = sc.nextInt();
//    if(n % 3 == 0 && n% 5 == 0){
//     System.out.println("divisible by both 3 and 5");
//    }
//    else{
//      System.out.println(" not divisible by both 3 and 5");
//    }
// }
//  }

 //  Check if a given year is a leap year. 
//   public static void main(String[] args){
//   Scanner sc = new Scanner(System.in);
//      System.out.println("Enter a number");
//     int n = sc.nextInt();
//     if(n%4 == 0 && n%100 != 0 ||(n%400 == 0)){
//          System.out.println("it is a leap year");
//     }
//     else{

//          System.out.println("regular year");
//     }

// }
//  }

//Take two numbers and print the larger one.
// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int a = sc.nextInt();
//     if(n> a){
//         System.out.println(n + " is larger one");
//     }
//     else{
//          System.out.println(a + " is larger one");
//     }
// }
//  }

//Take three numbers and print the largest. 

//  public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//      System.out.println("1st number :");
//      int n = sc.nextInt();
//       System.out.println("2nd number :");
//      int a = sc.nextInt();
//       System.out.println("3rd number:");
//       int x = sc.nextInt();
//       if(n >a && n > x){
//         System.out.println(n + " is a largest number");
//       }
//       else if(a > n && a > x){
//          System.out.println(a + " is a largest number");
//       }
//       else{
//          System.out.println(x + " is a largest number");
//       }
//       }
//       }

      // Take a temperature value and print “Cold”, “Warm”, or “Hot” using range conditions.
   //    public static void main(String[] args){
   //  Scanner sc = new Scanner(System.in);
   //   System.out.println("enter the temp :");
   //   int n = sc.nextInt();
     
   //    if( n >= 0 && n < 35){
   //      System.out.println(n + " is a cold temp");
   //    }
   //    else if(n >= 35 &&  n <  75){
   //       System.out.println(n + " is a warm temp");
   //    }
   //    else{
   //       System.out.println(n + " is a hot temp");
   //    }
   //    }
   //    }

   // Take a character and check if it’s a vowel or consonant. 

   //  public static void main(String[] args){
   //  Scanner sc = new Scanner(System.in);
   //    System.out.println("enter a character :");
   //     char ch = sc.next().charAt(0);

   //      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
   //          ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

   //          System.out.println(ch + " is a vowel");
   //      }
   //      else {
   //          System.out.println(ch + " is a consonant");
   //      }
   //  }
   // }

 //Take a character and check whether it’s uppercase, lowercase, a digit, or a special character. 
// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//        System.out.println("enter a character :");
//         char ch = sc.next().charAt(0);
//         if (ch >= 'A' && ch <= 'Z') {
//             System.out.println("Uppercase");
//         }
//         else if (ch >= 'a' && ch <= 'z') {
//             System.out.println("Lowercase");
//         }
//         else if (ch >= '0' && ch <= '9') {
//             System.out.println("Digit");
//         }
//         else {
//             System.out.println("Special Character");
//         }
//     }
// }

// Take three sides and check if they form a valid triangle. 
 //If the sides form a valid triangle, determine whether it is equilateral, isosceles, or scalene. 
// public static void main(String[] args){
//  Scanner sc = new Scanner(System.in);

//         System.out.println("Enter three sides: ");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();

//         if (a + b > c && a + c > b && b + c > a) {

//             System.out.println("Valid Triangle");

//             if (a == b && b == c) {
//                 System.out.println("Equilateral Triangle");
//             }
//             else if (a == b || b == c || a == c) {
//                 System.out.println("Isosceles Triangle");
//             }
//             else {
//                 System.out.println("Scalene Triangle");
//             }

//         }
//         else {
//             System.out.println("Invalid Triangle");
//         }
//     }
//    }

// Take marks (0–100) and print the corresponding grade (A/B/C/D/F). 
//      public static void main(String[] args){
//       Scanner sc = new Scanner(System.in);

//         System.out.println("Enter your marks: ");
//        int m = sc.nextInt();
       
//       if (m >= 90 && m <= 100)
//     System.out.println("Grade A");
// else if (m >= 80)
//     System.out.println("Grade B");
// else if (m >= 70)
//     System.out.println("Grade C");
// else if (m >= 40)
//     System.out.println("Grade D");
// else if (m >= 0)
//     System.out.println("Grade F");
//        else{
//           System.out.println("Invailid marks");
//        }
//       }
//    }
       

// Check if one of two given numbers is a multiple of the other.

//    public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter two numbers: ");
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         if (b != 0 && a % b == 0) {
//             System.out.println(a + " is a multiple of " + b);
//         }
//         else if (a != 0 && b % a == 0) {
//             System.out.println(b + " is a multiple of " + a);
//         }
//         else {
//             System.out.println("Neither number is a multiple of the other");
//         }
//     }
// }
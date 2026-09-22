import java.util.*;

public class functions {
    
    public static void Helloworld(){
        System.out.println("Hello World");
          System.out.println("Hello World");
            System.out.println("Hello World");
              System.out.println("Hello World");
    }

   /*  public static void calculatesum(){
 Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = a + b;
    System.out.println("sum is :" + sum);
    }
    public static void main(String args[]){
    // Helloworld();
    calculatesum();
    */

 /*public static int calculatesum(int num1 , int num2){
   int sum = num1 + num2;
 return sum;
   

 }
  public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = calculatesum(a , b);
     System.out.println("sum is :" + sum);

     */

 /*     
public static void swap( int a , int b) {
    //swap
    int temp = a;
    a = b;
    b = temp; 
System.out.println("a is :" + a);
 System.out.println("b is :" + b);
}
    

public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 //    swap-value exchanges
   int a = sc.nextInt();
   int b = sc.nextInt();

   int temp = a;
    a = b;
    b = temp; 
 System.out.println("a is :" + a);
 System.out.println("b is :" + b);
 swap(a, b);
 */

 /*
public static int multiply(int a , int b){
    int multiply = (a*b);
    return multiply;
}



public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 
   int a = sc.nextInt();
   int b = sc.nextInt();
 int prod = multiply(a,b);
System.out.println(prod);
*/


/* 
public static int factorial(int n){
    int f = 1;

    for(int i = 1; i <= n; i++){
        f = f*i;
    }
        return f;
    
}

public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
 System.out.println(factorial(n));

    
*/

/*

public static int factorial(int n){
    int f = 1;

    for(int i = 1; i <= n; i++){
        f = f*i;
    }
        return f;
}

      public static int binCoeff(int n , int r){
        int fact_n = factorial(n);
         int fact_r = factorial(r);
          int fact_nmr = factorial(n-r);
          int binCoeff = (fact_n)/(fact_r*fact_nmr);
      
          return binCoeff;
      }
    


public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int r = sc.nextInt();
     
 System.out.println(binCoeff(n , r));
*/

/* 
public static boolean isPrime(int n){
    if(n == 2){
        return true;
    }
    for(int i = 2; i <= n-1; i++){
        if(n%i == 0){
            return false;

        }
    }
    return true;
}


public static void primeInRange(int n){
    for(int i = 2; i <= n; i++){
        if(isPrime(i)){
        System.out.print(i + " ");
    }
}
System.out.println();
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    primeInRange(n);




    */

/*public static void binTodec(int binNum){
    int myNum = binNum;
    int pow = 0;
    int decNum = 0;
    while(binNum > 0){

        int lastDigit = binNum%10;
        decNum = decNum + (lastDigit * (int)Math.pow(2,pow));
        pow++;
        binNum = binNum/10;

    }
    System.out.println("decimal of " + myNum + "= " + decNum);
}
public static void main(String args[]){
     Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        int binNum = sc.nextInt();

        binTodec(binNum);

        sc.close();
        */

public static void decTobin(int n){
    int myNum = n;
    int pow = 0;
    int binNum = 0;
    while(n>0){
        int rem = n%2;
        binNum = binNum + (rem *(int)Math.pow(10 , pow));
        pow++;
        n = n/2;
    }
    System.out.print("binary form of" + myNum + "= " + binNum);
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    decTobin(n);
    sc.close();
}
        
}






    


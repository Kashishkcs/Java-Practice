import java.util.*;
public class loops {
 public static void main(String args[] ){
     Scanner sc = new Scanner(System.in);
     /* 
     for(int i = 0; i < 11;i++){
        System.out.println(i);
     }
        
       int i = 0;
       while(i<11){
         System.out.println(i);
         i++;
       }
    

       int i= 0;
       do{
         System.out.println(i);
         i++;
       }while(i<11);
       
       int n = sc.nextInt();
       int sum = 0;
       for( int i = 1; i <= n ; i++){
            sum = sum + i;
       }
        System.out.println(sum);

        

        int n = sc.nextInt();
        for(int i = 1; i <11 ; i++){
             System.out.println(n*i);
        }

        

        int n = sc.nextInt();
        int i = 1;
        while(i <=  n){
             System.out.println(i);
             i++;
            
        }
             */

/* 
        int n = sc.nextInt();
       // int rev = 0;
        while(n > 0){
            int lastdigit = n%10;
          //  rev = rev*10 + lastdigit;
            
            n = n/10;
        }
         System.out.println(n);
         */

         int n = sc.nextInt();
         if (n == 2){
             System.out.println("prime number");

         }
         else{
            boolean isPrime = true;
            for( int i = 2; i <= n-1 ; i++){
                if(n%1 == 0){
                     isPrime = false;
                }
            }
            if(isPrime = true){
                 System.out.println("prime number");
            }
            else{
                 System.out.println("Not primwe number");
            }
         }
}
}

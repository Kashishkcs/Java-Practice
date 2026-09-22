
import java.util.*;

public class strings {
    /* 
    public static boolean isPalindrome(String str){
        for (int i = 0; i <str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter a string :");
        String name;
        name = sc.next();
        System.out.println(isPalindrome(name));
    }
}
    */

/* 
public static float getShortestPath(String path){
    int x = 0 , y = 0;
    for(int i = 0; i < path.length(); i++){
        char dir = path.charAt(i);

        //south
        if(dir == 'S'){
            y--;
        }

        //North
        else if(dir == 'N'){
            y++;
        }

        //west
        else if(dir == 'W'){
           x--;
        }
        // east
    
            else if(dir == 'E'){
        
           x++;
            }
            }
            int X2 = x*x;
            int Y2 = y*y;
            return (float)Math.sqrt(X2 + Y2);
        }
        public static void main(String args[]){
            String path = "WNEENESENNN";
             System.out.println(getShortestPath(path));

        }

    }
        */
/* 
    public static String substring(String str, int si, int ei){
        String substr = "";
        for(int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String args[]){
        String str = "HelloWorld";
        System.out.println(substring(str , 0, 5));
    }
}
    */
/* 
public static void main(String args[]){
    String fruits[] = {"apple" , "banana", "mango"};
    String largest = fruits[0];
    for(int i=1; i<fruits.length; i++){
        if(largest.compareTo(fruits[i]) < 0){
            largest = fruits[i];

        }
    }
    System.out.println(largest);
}
}*/
/* 
public static void main (String args[]){
    StringBuilder sb = new StringBuilder("");
    for(char ch = 'a'; ch <= 'z'; ch++){
        sb.append(ch);
    }
    System.out.println(sb);
}
}
/*/
/* 
public static String toUpperCase(String str){
    StringBuilder sb = new StringBuilder("");
    char ch = Character.toUpperCase(str.charAt(0));
    sb.append(ch);
    for(int i = 1; i<str.length(); i++){
   if(str.charAt(i) == ' ' && i < str.length() - 1){
  sb.append(str.charAt(i));
  i++;
  sb.append(Character.toUpperCase(str.charAt(i)));
   } else{
    sb.append(str.charAt(i));
   }
    }
    return sb.toString();
}
public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the string :");
 String str = sc.nextLine();
  
  System.out.println(toUpperCase(str));
}
}
*/
/* 
public static String compress(String str){
    String newStr = " ";
    for(int i = 0; i < str.length(); i++){
Integer count = 1;
while(  i < str.length() -1 && str.charAt(i) == str.charAt(i+1)){
   count ++;
   i++;
}
newStr += str.charAt(i);
if(count > 1){
newStr += count.toString();
}
}
return newStr;
}

public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the string :");
 String str = sc.nextLine();
  
  System.out.println(compress(str));
}
}
*/
/* 
public static void main(String args[]){
    String str = "ShradhaDidi";
    String str1 = "ApnaCollege";
    String str2 = "ShradhaDidi";
    System.out.println(str.equals(str1) + " " + str.equals(str2));
}
}
*/
/* 
public static void main(String args[]){
    String str = "ApnaCollege".replace("l", "");
    System.out.println(str);
}
}
*/
/* 
public static void oddOrEven(int n){
    int bitMask = 1;
    if(( n & bitMask) == 0){
        System.out.println("even number");
    } else {
         System.out.println("odd number");
    }
}

public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        oddOrEven(n);
}
    
}
*/
/* 
 
public static int getIthBit(int n , int i){
    int bitMask = 1<<i;
    if((n & bitMask) == 0){
        return 0;
    } else {
        return 1;
    }
}

public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter a number:");
        int n = sc.nextInt();
       
        System.out.println("Enter bit position (i):");
        int i = sc.nextInt();

        int result = getIthBit(n, i);
        System.out.println("The bit at position " + i + " is: " + result);
    
}
}
*/
 /* 

public static int setIthBit(int n , int i){
    int bitMask = 1<<i;
    return n | bitMask;
        
    
    }


public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter a number:");
        int n = sc.nextInt();
       
        System.out.println("Enter bit position (i):");
        int i = sc.nextInt();

        int result = setIthBit(n, i);
        System.out.println("The bit at position " + i + " is: " + result);
    
}
}
*/
/* 
public static int clearIthBit(int n , int i){
    int bitMask = ~(1<<i);
    return n & bitMask;
        
    
    }


public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter a number:");
        int n = sc.nextInt();
       
        System.out.println("Enter bit position (i):");
        int i = sc.nextInt();

        int result = clearIthBit(n, i);
        System.out.println("The bit at position " + i + " is: " + result);
    
}
}
*/
/* 

public static int clearIthBit(int n , int i){
    int bitMask = ~(1<<i);
    return n & bitMask;
        
    
    }
public static int setIthBit(int n , int i){
    int bitMask = 1<<i;
    return n | bitMask;
        
    
    }




public static int updateIthBit(int n, int i, int newBit){
   // if(newBit == 0){
      //  return clearIthBit(n,i);
   // }
   // else{
       // return setIthBit(n,i);
   // }
//}

    n = clearIthBit(n,i);
    int BitMask = newBit<<i;
    return n | BitMask;
}
public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter a number:");
        int n = sc.nextInt();
       
        System.out.println("Enter bit position (i):");
        int i = sc.nextInt();
        
        System.out.println("Enter newbit:");
        int newBit = sc.nextInt();

        int result = updateIthBit(n, i, newBit );
        System.out.println("updated number is: " + result);
    
}
}
*/
/* 
public static int clearLastIBits(int n, int i) {
    int bitMask = (-1 << i);
    return n & bitMask;
}

public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter a number:");
        int n = sc.nextInt();
       
        System.out.println("Enter bit position (i):");
        int i = sc.nextInt();

        int result = clearLastIBits(n, i);
        System.out.println("The bit at position " + i + " is: " + result);
    
}
}
*/
/* 

public static int clearRangeIthBits(int n, int i, int j){
    int a = ((~0)<<(j+1));
    int b = (1<<i)-1;
    int bitMask = a|b;
    return n & bitMask;
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number :");
    
        int n = sc.nextInt();
       
        System.out.println("Enter bit position (i):");
        int i = sc.nextInt();
         System.out.println("Enter bit position (j):");
        int j = sc.nextInt();
        int result = clearRangeIthBits(n,i,j);
        System.out.println(result);

} 
}
*/
/* 
public static boolean isPowerOfTwo(int n){
     return n > 0 && (n & (n - 1)) == 0;

}

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number :");
    
        int n = sc.nextInt();
        System.out.println(isPowerOfTwo(n));
}
}
*/
/* 

public static int countSetBits(int n){
    int count = 0;
    while(n>0){
        if((n&1) != 0){
      count ++;
        }
        n = n>>1;
    }
    return count;
}

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number :");
    
        int n = sc.nextInt();
        System.out.println(countSetBits(n));
}
}
*/

public static int fastExponent( int n, int a){
    int ans = 1;
    while(n>0){
        if((n&1) != 0){
      ans = ans*a;
        }
        a = a*a;
        n = n>>1;
    }
    return ans;
}

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
     System.out.println(" enter power :");
    
        int a = sc.nextInt();
    System.out.println("enter a number :");
    
        int n = sc.nextInt();
        System.out.println(fastExponent(a,n));
}
}










































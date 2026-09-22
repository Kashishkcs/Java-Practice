import java.util.*;
public class recursion{
   /*
    static void printNum(int n){
        if(n == 0){
            return ;

        }
        System.out.println(n);
        printNum(n-1);

    }
    public static void main(String  args[]){
         Scanner sc = new Scanner (System.in);
         System.err.print("Enter a number: ");
         int n =sc.nextInt();
         printNum(n);
    }
}*/
/* 
public static void towerofHanoi(int n , String src , String help , String dest){
    if (n == 1){
        System.err.println("transfer" + n + "from" + src + "to" + dest );
        return;
    }
    towerofHanoi(n-1 , src , dest , help);
     System.err.println("transfer" + n + "from" + src + "to" + dest );
     towerofHanoi(n-1 , help , src , dest);

}
 public static void main(String  args[]){
         Scanner sc = new Scanner (System.in);
         System.err.print("Enter the number of disk: ");
         int n =sc.nextInt();
         towerofHanoi(n , "S" , "H" , "D");
 }
}
 */
/* 
public static void printRev(String src , int indx){
    if(indx == 0){
        System.err.println(src.charAt(indx));
        return;
    }
    System.err.println(src.charAt(indx));
    printRev(src , indx-1);
}
 
         
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        printRev(str, str.length() - 1);

}
}
*/
/*
public static int first = -1;
public static int last = -1;
public static void findOccurance(String str , int idx , char element){
    if(idx == Str.length()){
        System.err.println(first);
        System.err.println(last);
        return;
    }
    char currChar = str.charAt(idx);
    if(currChar == element){
        if(first == -1){
            first = idx;
         } else{
            last = idx;
        }
    }
    findOccurance(str ,idx+1 , element);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        findOccurance(str, str.length() - 1);

}
    }
*/
/*
public static boolean isSorted(int []arr , int idx){
    if(idx == arr.length-1){
        return true;

    }
    if(arr[idx] < arr[idx +1]){
        return isSorted(arr,idx+1);
    }
    else{
        return false;
    }
}

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.err.println("enter no of elements : ");
    int n = sc.nextInt();
    int []arr = new int[n];
    System.err.println("enter array elements : ");
    
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (isSorted(arr, 0)) {
            System.out.println("Array is sorted.");
        } else {
            System.out.println("Array is not sorted.");
        }
    }
}
*/
/* 
public static void moveAllX(String str , int idx , int count , String newString){
    if(idx == str.length()){
        for(int i = 0 ; i < count ; i ++){
            newString = newString + 'x';

        }
        System.err.println(newString);
        return;
    }
        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++;
            moveAllX(str , idx+1 , count , newString);
        }
        else{
            newString = newString + currChar;
             moveAllX(str , idx+1 , count , newString);
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        moveAllX(str, 0 , 0 , " ");
    }
}
*/

/* 
public static boolean[] map = new boolean[256];
public static void remDup(String str , int idx , String newString){
    if(idx == str.length()){
        System.err.println(newString);
        return;
    }
    char currChar = str.charAt(idx);
    if(map[currChar]){
        remDup(str, idx+1 , newString);
    }
    else{
        map[currChar] = true;
         remDup(str, idx+1 , newString + currChar);
    }
}
 
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.err.println("enter a string :");
    String str = sc.nextLine();
    remDup(str , 0 , " ");

}
}
*/

/* 
public static void printSubsequence(String str , int idx , String newString){
    if(idx == str.length()){
        System.err.println(newString);
        return;
    }
    char currChar = str.charAt(idx);
      printSubsequence(str , idx+1 , newString + currChar);

     printSubsequence(str , idx+1 , newString);

}
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
     System.err.println("enter a string :");
     String str = sc.nextLine();
     System.err.println("enter all subsequences :");
      printSubsequence(str , 0 , " ");
  }
  }
*/


/*
public static void printSubsequence(String str , int idx , String newString , HashSet<String>set){
    if(idx == str.length()){
        if(!set.contains(newString)){
            System.err.println(newString);
            set.add(newString);
        }
       
        return;
    }
    char currChar = str.charAt(idx);
      printSubsequence(str , idx+1 , newString + currChar , set);

     printSubsequence(str , idx+1 , newString , set);

}
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
     System.err.println("enter a string :");
     String str = sc.nextLine();
     HashSet<String>set = new HashSet<>();
     System.err.println("enter all unique subsequences :");
      printSubsequence(str , 0 , " " , set);
  }
  }
  */
 /* 

    static String[] keypad = {
            ".",      // 0
            "abc",    // 1
            "def",    // 2
            "ghi",    // 3
            "jkl",    // 4
            "mno",    // 5
            "pqrs",   // 6
            "tu",     // 7
            "vwx",    // 8
            "yz"      // 9
    };

    public static void printCombination(String str, int idx, String combination) {

        // Base case
        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }

        // Current digit
        char currDigit = str.charAt(idx);

        // Convert character digit to integer
        String mapping = keypad[currDigit - '0'];

        // Try every letter of the current digit
        for (int i = 0; i < mapping.length(); i++) {
            printCombination(str, idx + 1,
                    combination + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number string: ");
        String str = sc.nextLine();

        System.out.println("Possible combinations:");
        printCombination(str, 0, "");

        sc.close();
    }
}
*/
/* 

public static void printPerm(String str , String permutation){
    if(str.length() == 0){
        System.err.println(permutation);
        return;
    }
    for(int i = 0; i <str.length() ; i++){
    char currChar = str.charAt(i);
    String newStr = str.substring(0 , i) + str.substring(i+1);
    printPerm(newStr, permutation + currChar);
    }
}
 public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number string: ");
        String str = sc.nextLine();

        System.out.println("Possible combinations:");
        printPerm(str, " ");
 }
}
 */
/* 

public static int printPaths(int i , int j , int  n, int m){
    if(i== n || j== m){
        return 0;
    }
    if(i == n-1 && j == m-1){
        return 1;
    }
   int downPaths =  printPaths(i+1 ,j , n , m);
    int rightPaths =  printPaths(i ,j+1 , n , m);
    return downPaths + rightPaths;
}

public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
    System.err.println("enter n :");
    int n = sc.nextInt();
     System.err.println("enter m :");
   
    int m = sc.nextInt();
    int totalPaths = printPaths(0 , 0 , n , m);
    System.err.println( "totalPaths is " + totalPaths);
}
}
*/
/* 
public static int placeTiles(int n , int m ){
    if( n == m){
        return 2;
    }
    if(n < m ){
        return 1;
    }
   int vertPlacement =  placeTiles(n-m , m);
    int horPlacement =  placeTiles(n-1 , m);
    return vertPlacement +  horPlacement;
}

public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
    System.err.println("enter n :");
    int n = sc.nextInt();
     System.err.println("enter m :");
   
    int m = sc.nextInt();
   System.err.println(placeTiles(n , m));
}
}*/

// Print all binary strings of size N without  consecutive ones.


/* 
    static void printBinaryStrings(int n, String str, int last) {

        // Base case
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // Put 0
        printBinaryStrings(n - 1, str + "0", 0);

        // Put 1 only if previous character is 0
        if (last == 0) {
            printBinaryStrings(n - 1, str + "1", 1);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        printBinaryStrings(n, "", 0);
    }
}*/








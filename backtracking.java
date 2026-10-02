import java.util.*;

public class backtracking {
    /* *
    public static void changArr(int arr[], int i , int val){
        // base case
        if(i == arr.length){
            printArr(arr);
            return;
        }

        // recursion 

        arr[i] = val;
        changArr(arr , i + 1, val + 1);
        arr[i] = arr[i] - 2;
    }
    public  static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr [i] + " ");
        }
        System.out.println();
    }
    public static void main (String args[]){
        int arr[] = new int [5];
        changArr(arr, 0 ,1);
        printArr(arr);
    }
    
}
    */

/* 
   public static void findSubsets(String str , String ans , int i){
    // base case
  if( i == str.length()){
    if(ans.length() == 0){
    System.out.println("null");
  } else {
    System.out.println(ans);
  }
  return;
  }
    // yes choice
    findSubsets(str , ans + str.charAt(i) , i + 1);

    //  no choice
    findSubsets(str , ans , i+1);
   }

   public static void  main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str =  sc.nextLine();
    findSubsets(str , "" , 0);
   }
}
   */
  /* 

public static void findPermutation(String str , String ans){
    if(str.length() == 0){
        System.out.println(ans);
        return;
    }
    for(int i = 0; i < str.length(); i++){
        char curr = str.charAt(i);
        String NewStr = str.substring(0,i) + str.substring(i+1);
        findPermutation(NewStr , ans + curr);
    }}
          public static void  main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str =  sc.nextLine();
    findPermutation(str , "" );
    }
} 

*/

// N Queens //
 /* 
public static boolean isSafe(char board[][], int row, int col){

    // vertical up
    for(int i = row - 1; i >=0; i--){
        if(board[i][col] == 'Q'){
            return false;
        }
    }
     for(int i = row - 1, j = col -1; i >=0 && j >= 0; i-- , j--){
        if(board[i][j] == 'Q'){
            return false;
        }
    }
    for(int i = row - 1, j = col + 1; i >=0 && j < board.length; i-- , j++){
        if(board[i][j] == 'Q'){
            return false;
        }
    }
    return true;
}

public static void nQueens (char board[][], int row){
    //base
    if(row == board.length){
        printBoard(board);
        return;
    }
    // column loop

    for(int j = 0; j < board.length; j++){
        if(isSafe(board, row, j)){
            board[row][j] = 'Q';
            nQueens(board, row+1); //function call
            board[row][j] = 'x'; // backtracking step
        }
    }
}

public static void printBoard(char board[][]){
    System.out.println("--------chess board -------");
for(int i = 0; i < board.length; i++){
for(int j = 0; j < board.length; j++){
    System.out.print(board[i][j] + " ");
}
System.out.println();
}
System.out.println();
}


public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter no of queens");
    int n = sc.nextInt();
    char board[][] = new char[n][n];

    for(int i = 0; i < n; i++){
        for(int j=0; j < n; j++){
            board[i][j] = 'x';
        }
    }
    nQueens(board, 0);
}
}
*/

// count total no of ways  for nQueens //


/* 
public static boolean isSafe(char board[][], int row, int col){

    // vertical up
    for(int i = row - 1; i >=0; i--){
        if(board[i][col] == 'Q'){
            return false;
        }
    }
     for(int i = row - 1, j = col -1; i >=0 && j >= 0; i-- , j--){
        if(board[i][j] == 'Q'){
            return false;
        }
    }
    for(int i = row - 1, j = col + 1; i >=0 && j < board.length; i-- , j++){
        if(board[i][j] == 'Q'){
            return false;
        }
    }
    return true;
}

public static void nQueens (char board[][], int row){
    //base
    if(row == board.length){
       // printBoard(board);
       count++;
        return;
    }
    // column loop

    for(int j = 0; j < board.length; j++){
        if(isSafe(board, row, j)){
            board[row][j] = 'Q';
            nQueens(board, row+1); //function call
            board[row][j] = 'x'; // backtracking step
        }
    }
}

public static void printBoard(char board[][]){
    System.out.println("--------chess board -------");
for(int i = 0; i < board.length; i++){
for(int j = 0; j < board.length; j++){
    System.out.print(board[i][j] + " ");
}
System.out.println();
}
System.out.println();
}

static int count = 0;
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter no of queens");
    int n = sc.nextInt();
    char board[][] = new char[n][n];

    for(int i = 0; i < n; i++){
        for(int j=0; j < n; j++){
            board[i][j] = 'x';
        }
    }
    nQueens(board, 0);
    System.out.println("Total ways to solve n queens  = " + count);
}
}
*/

// check if problem can be solved & print only 1 solution to N queens problem.

/* 
public static boolean isSafe(char board[][], int row, int col){

    // vertical up
    for(int i = row - 1; i >=0; i--){
        if(board[i][col] == 'Q'){
            return false;
        }
    }
     for(int i = row - 1, j = col -1; i >=0 && j >= 0; i-- , j--){
        if(board[i][j] == 'Q'){
            return false;
        }
    }
    for(int i = row - 1, j = col + 1; i >=0 && j < board.length; i-- , j++){
        if(board[i][j] == 'Q'){
            return false;
        }
    }
    return true;
}

public static boolean nQueens (char board[][], int row){
    //base
    if(row == board.length){
       // printBoard(board);
       count++;
        return true;
    }
    // column loop

    for(int j = 0; j < board.length; j++){
        if(isSafe(board, row, j)){
            board[row][j] = 'Q';
           if (nQueens(board, row+1)) {
            return true;
           }
            board[row][j] = 'x'; // backtracking step
        }
    }
    return false;
}

public static void printBoard(char board[][]){
    System.out.println("--------chess board -------");
for(int i = 0; i < board.length; i++){
for(int j = 0; j < board.length; j++){
    System.out.print(board[i][j] + " ");
}
System.out.println();
}
System.out.println();
}

static int count = 0;
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter no of queens");
    int n = sc.nextInt();
    char board[][] = new char[n][n];

    for(int i = 0; i < n; i++){
        for(int j=0; j < n; j++){
            board[i][j] = 'x';
        }
    }
    if(nQueens(board, 0)){
       System.out.println("Solution is possible");
       printBoard(board);
    } else {
        System.out.println("solution is not possible");
    }
   // System.out.println("Total ways to solve n queens  = " + count);
}
}
*/
/* 

public static int gridWays(int i, int  j, int n, int m){

    // base case
    if(i == n-1 && j == m-1 ){
        return 1;// condn for last cell

    } else if(i == n || j == m){
   return 0;  //boundary cross condn
    }
    int w1 = gridWays(i+1, j, n, m);
    int w2 = gridWays(i, j+1, n, m);
    return w1 + w2;

}

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    System.out.println(gridWays(0, 0, n, m));
}
}*/
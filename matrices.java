import java.util.*;
public class matrices {
    /* 
    public static void main(String args[]){
        int matrix[][] = new int[3][3];
        int n = matrix.length; int  m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++){
             for(int j = 0; j < m; j++){
                matrix[i][j] = sc.nextInt();
        }
    }
    //output
         for(int i = 0; i < n; i++){
             for(int j = 0; j < m; j++){
                System.out.print(matrix[i][j] + " ");

}
 System.out.println();
         }
        }
    
}
        */

/* 
public static boolean search(int matrix[][],int key){
     for(int i = 0; i <  matrix.length; i++){
             for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("found at cell (" + i + ", " +  j +  " )");
                    return true;
                }
            }
                }
                System.out.println("key not found");
                return false;
}
 public static void main(String args[]){
        int matrix[][] = new int[3][3];
        int n = matrix.length; int  m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++){
             for(int j = 0; j < m; j++){
                matrix[i][j] = sc.nextInt();
        }
    }
    //output
         for(int i = 0; i < n; i++){
             for(int j = 0; j < m; j++){
                System.out.print(matrix[i][j] + " ");

}
 System.out.println();
         }
        
        search(matrix, 5);
    
}
}
*/

/* 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        // Input matrix elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Initialize min and max with first element
        int smallest = matrix[0][0];
        int largest = matrix[0][0];

        // Find smallest and largest
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] < smallest) {
                    smallest = matrix[i][j];
                }
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
            }
        }

        // Output result
        System.out.println("Smallest element: " + smallest);
        System.out.println("Largest element: " + largest);

        sc.close();
    }
}
    */

/* 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        // Input matrix elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Spiral order logic
        int startRow = 0, startCol = 0;
        int endRow = rows - 1, endCol = cols - 1;

        System.out.println("Spiral order:");
        while (startRow <= endRow && startCol <= endCol) {

            // Top row
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            startRow++;

            // Right column
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            endCol--;

            // Bottom row
            if (startRow <= endRow) {
                for (int j = endCol; j >= startCol; j--) {
                    System.out.print(matrix[endRow][j] + " ");
                }
                endRow--;
            }

            // Left column
            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    System.out.print(matrix[i][startCol] + " ");
                }
                startCol++;
            }
        }

        sc.close();
    }
}
*/


//public static int diagonalSum(int matrix[][]){
    //int sum = 0;
/* 
    for(int i = 0; i< matrix.length; i++){
        for(int j=0; j<matrix[0].length; j++){
            if(i == j){
                 sum += matrix[i][j];
            }
            else if(i+j == matrix.length-1){
                sum += matrix[i][j];
            }
        }
    }
    */
   /*  for(int i = 0; i< matrix.length; i++){//
        sum+= matrix[i][i];
        
            if(i != matrix.length-1-i)
                sum += matrix[i][matrix.length-i-1];
        }
    return sum;
}
public static void main(String args[]){
     int matrix[][] = {{1, 2, 3, 4},
                      {5, 6, 7, 8},
                      {9, 10, 11, 12},
                      {13, 14 ,15, 16}};
                      
        int result = diagonalSum(matrix);
        System.out.println("Diagonal sum = " + result);
}
}*/
//
/* 
public static boolean stairCaseSearch(int matrix[][] , int key){
int row = 0; int col = matrix[0].length-1;
while(row <matrix.length && col > 0){
    if(matrix[row][col] == key){
        System.out.println("found key at (" + row + "," + col + ")");
        return true;
    }
    else if(key < matrix[row][col]){
        col--;
    }
    else{
        row++;
    }
    }
    System.out.println("key not found");
    return false;
}

public static void main(String args[]){
    int matrix[][] = {{10,20,30,40},
                         {15, 25,35,45},
                        {27,29,37,48},
                    {32,33,39,50}};
                    int key = 33;
                    stairCaseSearch(matrix,key);
}
}
*/

public static void main(String args[]){
    int matrix[][] = {{4,7,8},
                     {8,8,7}};
                     int countof7 = 0;
                     for(int i = 0; i <matrix.length; i++){
                        for(int j = 0; j <matrix[0].length; j++){
                            if(matrix[i][j] == 7){
                            countof7++;
                            }
                        }
                     }
                     System.out.println("count of 7 is :" + countof7);
}
}






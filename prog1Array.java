import java.util.*;
public class prog1Array {
//public static void main(String[] args){
      //  Scanner sc = new Scanner(System.in);

        // print negative number from a array. //
    //     System.out.println("enter size of array");
    //     int n = sc.nextInt();
    //     int [] arr = new int[n];
    //      System.out.println("enter the array element");
    //     for(int i = 0; i<n; i++){
    //         arr[i] = sc.nextInt();
    //     }

    //         for(int i = 0; i<n;i++){
    //             if(arr[i] < 0){
    //                System.out.print(arr[i] + " ");  
    //             }
    //         }
    //     }
    // }

//  print sum of elements of the array. //

// System.out.println("enter size of array");
// int n = sc.nextInt();
// int []arr = new int[n];
// System.out.print("enter the element of array");
// for(int i = 0; i < n; i++){
//     arr[i] = sc.nextInt();
// }
// int sum = 0;
// for(int i = 0; i < n ; i++){
// sum  += arr[i]; 

// }
// System.out.println(sum);

//     }
// }

// print the product of the array elements. //
// System.out.println("enter size of array");
//  int n = sc.nextInt();
//  int []arr = new int[n];
//  System.out.print("enter the element of array");
// for(int i = 0; i < n; i++){
//      arr[i] = sc.nextInt();
//  }

//  int product = 1;
//  for(int i = 0; i < n ; i++){
//     product *= arr[i];
//  }
//  System.out.println(product);
// }
// }

// print the maximum element in the array.//

// System.out.println("enter size of array");
//  int n = sc.nextInt();
//  int []arr = new int[n];
//  System.out.print("enter the element of array");
// for(int i = 0; i < n; i++){
//      arr[i] = sc.nextInt();
//  }
//  int max = arr[0];
//  for(int  i = 0; i < n; i++){
//     if(arr[i] > max){
//         max = arr[i];
//     }
// }
//     System.out.println(max);
 
// }
// }

// another way //
//using Integer.MIN_VALUE

// System.out.println("enter size of array");
//  int n = sc.nextInt();
//  int []arr = new int[n];
//  System.out.print("enter the element of array");
// for(int i = 0; i < n; i++){
//      arr[i] = sc.nextInt();
//  }
//  int max = Integer.MIN_VALUE;
//  for(int  i = 0; i < n; i++){
//     if(arr[i] > max){
//         max = arr[i];
//     }
// }
//     System.out.println(max);
 
// }
// }
// print the minimum element in the array.//


// System.out.println("enter size of array");
//  int n = sc.nextInt();
//  int []arr = new int[n];
//  System.out.print("enter the element of array");
// for(int i = 0; i < n; i++){
//      arr[i] = sc.nextInt();
//  }
//  int min = Integer.MAX_VALUE;
//  for(int  i = 0; i < n; i++){
//     if(arr[i] < min){
//         min = arr[i];
//     }
// }
//     System.out.println(min);
 
// }
// }


// sortarrayBuiltin //
//   int n = sc.nextInt();
//  int[] arr = new int[n];
// for(int i = 0; i < n; i++){
//      arr[i] = sc.nextInt();
//  }
// for(int i = 0; i < n; i++){
// if(i%2 == 0){
//     arr[i] += 10;
// }
// else{
//     arr[i] *= 2;
// }
// }

// System.out.println("updated array");
// for(int i =0; i < n; i++){
//     System.out.print(arr[i] + " ");
// }

//     }

// }

// Linear search// 

//     public static int linearSearch(int numbers[], int key) {

//         for (int i = 0; i < numbers.length; i++) {

//             if (numbers[i] == key) {
//                 return i;
//             }
//         }

//         return -1;
//     }

//     public static void main(String args[]) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();

//         int numbers[] = new int[n];

//         System.out.println("Enter array elements:");

//         for (int i = 0; i < n; i++) {
//             numbers[i] = sc.nextInt();
//         }

//         System.out.print("Enter key to search: ");
//         int key = sc.nextInt();

//         int index = linearSearch(numbers, key);

//         if (index == -1) {
//             System.out.println("NOT FOUND");
//         } 
//         else {
//             System.out.println("Key is at index: " + index);
//         }
//     }
// }



    public static void twoSum(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {
                    System.out.println("Indices: " + i + " " + j);
                    return;
                }
            }
        }

        System.out.println("No pair found");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        twoSum(arr, target);
    }
}
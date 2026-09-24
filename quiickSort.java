import java.util.Scanner;

public class quiickSort {
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

    }
    public static void quickSort(int arr[], int si, int ei){
         if(si >= ei) {
            return;
        }

        // last element
        int pidx = partition(arr, si , ei);
        quickSort(arr, si, pidx-1);//left
        quickSort(arr, pidx+1, ei);//right
    }

    public  static int partition(int arr[], int si, int ei){
          
        int pivot = arr[ei];
        int i = si -1; // to make place for els smaller than pivot
        for(int j =si; j < ei; j++){
            if(arr[j] <= pivot){
                i++;
                //swap
                int temp = arr[j];
                 arr[j] = arr[i];
                arr[i] = temp;
            
        }
        }
        i++;
         int temp = arr[ei];
                 arr[ei] = arr[i];
                arr[i] = temp;
                return i;
    }
 public static void main(String args[]){
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Original array:");
        printArr(arr);

       quickSort(arr, 0, arr.length - 1);

        System.out.print("Sorted array:");
        printArr(arr);

        sc.close();
    }
    
}

import java.util.*;
public class start {
   
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
    
     int n = sc.nextInt();
       int[] arr = new int[n];

       for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
       }
       /* 
       int largest = arr[0];
       for(int i = 0 ; i < n ; i++){
         if(arr[i] > largest){
            largest = arr[i];
         }

       }
       System.err.println(largest);
    }
}*/

/* 
 int smallest = arr[0];
       for(int i = 0 ; i < n ; i++){
         if(arr[i] < smallest){
            smallest = arr[i];
         }

       }
       System.err.println(smallest);
    }
}*/

// array traversal//
/* 
boolean isSorted = true;

for(int i = 0; i < n - 1; i++){

    if(arr[i] > arr[i + 1]){

        isSorted = false;
        break;

    }

}

System.out.println(isSorted);
     
    }
}
    */
/*  linear search
int target = sc.nextInt();
int index = -1;
for(int i = 0 ; i < n ; i++){ 
if(arr[i] == target){
    index = i;
    break;
}
}
System.out.println(index);
}
}  */ 
/* 
  for(int i = 0; i < nums.length; i++){
    sum = sum + arr[i];
    ans[i] = sum;
  }
       
      int largest = 0;
      for(int i = 1; i < n; i++ ){
        if(arr[i] > largest){
            largest = arr[i];
        }
      }
      System.out.println(largest);
    }}
      */


    
    public int[] runningSum(int[] nums){
      for(int i = 0; i < nums.length; i++){
        nums[i] = nums[i] + nums[i+1];
      }
    
    return nums;
    }

    public int[] concentrated(int[] nums){
      int[] ans = new int[2*nums.length];
      for(int i =1; i <nums.length; i++){
        ans[i] = nums[i];
         ans[i+ nums.length] = nums[i] ; 
      }
      return ans;

    }

    int left = 0;
     for(int right = 1; right < n; right++){
      if(arr[left] != arr[right]){
        return false;
        left++;
      }
      arr[left] == arr[right];
     }

public int removeElement(int[] nums, int val){
  int left = 0;

  for(int right = 0; right < nums.length; right++){
    if(nums[right] == val){
      nums[left] = nums[right];
      left++;
    }
  }
  return left;
}
    }
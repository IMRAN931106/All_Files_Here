// import java.util.*;
public class Sorting {
    // inbuilt function 
    public static void printArray(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

   // main function
   public static void main(String args[]) {
    int arr[] = {7,8,3,4,1,2};
    //outer loop
    for(int i = 0; i < arr.length-1; i++) {
        // System.out.println(i);
        for(int j = 0; j < arr.length-i-1; j++) {
          if(arr[j] > arr[j + 1]) {
            // swap
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;

            // System.out.println("Swapped elements: " + arr[j] + " and " + arr[j + 1]);
          }
      
        }
    }

printArray(arr);

}

}

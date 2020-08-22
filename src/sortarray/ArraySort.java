/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortarray;
import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author AnooD
 */
public class ArraySort {

  void bubbleSort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                   
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
    } 
     
       void selectionsort(int arr[]) 
    { 
        int n = arr.length; 
  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
  
            // Swap the found minimum element with the first 
            // element 
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
    } 
     


          void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
        static  int [] generateRandom() {
      Random rd = new Random(); // creating Random object
      int max_size = 500;
      int[] arr = new int[rd.nextInt(max_size)];
      for (int i = 0; i < arr.length; i++) {
         arr[i] = rd.nextInt(); 
         
      }
   
      return arr;
          }
  
    // Driver method to test above 
    public static void main(String args[]) 
    { 
        ArraySort ob = new ArraySort(); 
        int arr[] = generateRandom();
        ob.bubbleSort(arr); 
        System.out.println("Sorted array"); 
        ob.printArray(arr); 
       
    }
    
}

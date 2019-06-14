import java.util.Arrays; 
import java.util.*; 
import java.util.Collections; 
  
public class Main 
{ 
    public static void kLargest(Integer [] arr, int k)  
    { 
        // Sort the given array arr in reverse order 
        // This method doesn't work with primitive data 
        // types. So, instead of int, Integer type  
        // array will be used  
        Arrays.sort(arr, Collections.reverseOrder());  
      
      
    // Print the first kth largest elements  
    //for (int i = 0; i < k; i++)  
    System.out.print(arr[k-1] + " "); 
    }  
      
      
    public static void main(String[] args)  
    { 
       Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      Integer arr[] = new Integer[n];
      for(int i=0;i<n;i++)
      {
         arr[i] = in.nextInt();
      }
        int k = in.nextInt(); 
        kLargest(arr,k);      
    } 
} 
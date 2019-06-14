import java.util.Scanner; 
public class Main 
{ 
    public static void main(String[] args) 
    { 
        // Our arr contains 8 elements 
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int arr[] = new int[n]; 
        
        for(int i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();
        }
      int count_freq = 0;
             for(int j = 1; j <= k; j++)
             {
               count_freq = 0;
               for(int i = 0; i < n; i++)
               {
                 if(j == arr[i])
                 {
                   count_freq ++;
                 }
               }
                System.out.println(j+" "+count_freq);
              
             }
    } 
} 
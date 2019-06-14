import java.util.Scanner;
public class Main {
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];
        
        for(int i = 0;i < size;i ++)
        {
            arr[i] = in.nextInt();
            
        }
         int sum1 = 0;
         int sum2 = 0;
         int sum3 = 0;
         if(size == 6)
         {
             for(int i = 0;i < size;i ++)
             {
               if(i < 3)
               {
                    sum1 = sum1 + arr[i];
               }
               else if(i > 2 && i < 6)
               {
                    sum2 = sum2 + arr[i];
               }
             }  
             if(sum1 == sum2 )
             {
                System.out.println("Perfect Batch");
             }
            else
            {
                System.out.println("Not a Perfect Batch");
            }
         } 
         else
         {
              for(int i = 0;i < size;i ++)
              {
                  if(i < 3)
                  {
                      sum1 = sum1 + arr[i];
                  }
                  else if(i > 2 && i < 6)
                  {
                      sum2 = sum2 + arr[i];
                  }
                 else if(i > 5 && i < 9)
                 {
                    sum3 = sum3 + arr[i];
                 }
              }  
                 if((sum1 == sum2) && (sum2 == sum3))
                 {
                     System.out.println("Perfect Batch");
                 }
                 else
                {
                     System.out.println("Not a Perfect Batch");
                }
           
        }
     
    }
}

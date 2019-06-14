import java.util.Scanner;
public class Main
{
    public static void main(String args[])
   {
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for(int i = 0;i<arr_size;i++)
      {
         arr[i] = in.nextInt();
      }
      int mid = arr_size/2;
      for(int i = 0;i<=mid-1;i++)
      {
         for(int j = i+1; j<=mid-1; j++)
         {
             if(arr[i] > arr[j])
             {
                 int temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
             }
         }
      }
      for(int i = mid;i < arr_size;i++)
      {
         for(int j = i+1; j<arr_size; j++)
         {
             if(arr[i] < arr[j])
             {
                 int temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
             }
         }
      }
      for(int i = 0;i<arr_size;i++)
      {
         System.out.print(arr[i]+" ");
      }
    }
}

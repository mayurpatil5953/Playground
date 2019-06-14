import java.util.Scanner;
class Main
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
      for(int idx1 = 0;idx1 < arr_size;idx1 ++)
      {
         for(int idx2 = idx1;idx2 < arr_size;idx2 ++)
         {
          if((arr[idx1] < arr[idx2]) && (arr[idx2] > arr[idx2 -1]))
          {
             System.out.println(arr[idx1]+","+arr[idx2]);
          }
         }
      }
      
    //your code here;
  }
}
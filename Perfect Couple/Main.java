import java.util.Scanner;
class Main{
    public static void pairs_sum(int arr_size,int arr[], int val)
    { 
      int sum = 0;
      for(int i = 0; i < arr_size; i++)
      {
          for(int j = i + 1; j < arr_size; j++)
          {
             sum = arr[i]+arr[j];
             if(sum == val)
             {
                System.out.println(arr[i]+","+" "+arr[j]);
             }
          }
      }
    }
    public static void main(String args[]) {
      // Type your code here
    Scanner in = new Scanner(System.in);
    int arr_size = in.nextInt();
    int arr[] = new int[arr_size];
    for(int i = 0; i < arr_size; i++)
    {
       arr[i] = in.nextInt();
    }
      int val = in.nextInt();
      pairs_sum(arr_size,arr,val); 
      
  }
}
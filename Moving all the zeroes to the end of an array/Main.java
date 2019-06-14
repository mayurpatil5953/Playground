import java.util.Scanner;
public class Main
{
  public static void segregate_negpos(int arr_size, int arr[])
  {
    int zero[] = new int[arr_size];
    int pos[] = new int[arr_size];
    int zero_size = 0;
    int pos_size = 0;
    
     for(int i = 0; i < arr_size; i ++)
     {
        if(arr[i] == 0)
        {
              zero[zero_size] = arr[i];
              zero_size++;
        }
        else
        {
              pos[pos_size] = arr[i];
              pos_size++;
        }
     }
    int arr_index = 0;
    for(int index = 0; index < pos_size; index ++)
     { 
         arr[arr_index] = pos[index];
         arr_index++;
     }
     for(int index = 0; index < zero_size; index ++)
     { 
         arr[arr_index] = zero[index];
         arr_index++;
     }
     for(int index = 0; index < arr_size; index ++)
     { 
         System.out.print(arr[index]+" "); 
         
     }
    
      
  }
public static void main(String args[])
{
//Try out your code here
   Scanner in = new Scanner(System.in);
    int arr_size = in.nextInt();
    int arr[] = new int[arr_size];
    for(int i = 0; i < arr_size; i++)
    {
       arr[i] = in.nextInt();
    }
    segregate_negpos(arr_size, arr);
}
}
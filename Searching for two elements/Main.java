import java.util.Scanner;
public class Main 
{
     
    public static void main(String args[]) 
    {
        Scanner in = new Scanner (System.in);
        int size = in.nextInt();
        int arr[] = new int [size];
        for(int i = 0; i < size; i++)
        {
            arr[i] = in.nextInt();
        }
        int search_ele_1 = in.nextInt();
        int search_ele_2 = in.nextInt();
        
        int flag = 0;
         for(int i = 0; i < size; i++)
        {
            if(search_ele_1 == arr[i])
            {
                System.out.println(i);
                flag = 0;
                break;
            }
            else
            {
                flag = 1;
            }
        }
         if(flag == 1)
            {
                System.out.println("-1");
            }
            
              int flag1 = 0;
         for(int i = 0; i < size; i++)
        {
            if(search_ele_2 == arr[i])
            {
                System.out.println(i);
                flag1 = 0;
                break;
            }
            else
            {
                flag1 = 1;
            }
        }
         if(flag1 == 1)
            {
                System.out.println("-1");
            }
    }
}
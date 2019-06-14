import java.util.Scanner;
public class Main 
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner (System.in);
        int size = in.nextInt();
        int a[] = new int [size];
        for(int i = 0; i < size; i++)
        {
            a[i] = in.nextInt();
        }
        
        int large = a[0];
         for(int i = 0; i < size; i++)
        {
            if(large > a[i])
            {
                large = large;
            }
            else
            {
                large = a[i];
            }
        }
        System.out.println(large);
        
        
    }
}
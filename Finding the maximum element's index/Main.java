import java.util.Scanner;
public class Main 
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner (System.in);
        int size = in.nextInt();
        int a[] = new int [size];
        int index = 0;
        
        for(int i = 0; i < size; i++)
        {
            a[i] = in.nextInt();
        }
        
        int large = a[0];
        int k;
         for( k = 0; k < size; k++)
        {
            if(large > a[k])
            {
                large = large;
            }
            else
            {
                large = a[k];
                index = k;
            }
        }
        System.out.println(index);
        
        
    }
}
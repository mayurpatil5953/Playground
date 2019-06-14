import java.util.Scanner;
public class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    String[] arrOfstring = str.split(" ");
    int length = arrOfstring.length;
    
    for (int i = 0; i < length; i++)
    {
        if(arrOfstring[i] != null)
        {
        for(int j = i+1 ; j < length; j++)
        {
           if(arrOfstring[i].equals(arrOfstring[j]))
           {
               arrOfstring[j] = null;
           }
        }
        }
    }
    for (int i = 0; i < length; i++)
    {
        if(arrOfstring[i] != null)
        {
            System.out.print(arrOfstring[i]+" ");
        }
    }
  }
}
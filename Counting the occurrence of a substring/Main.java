import java.util.Scanner;
public class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner in = new Scanner(System.in);
    String str1 = in.nextLine();
    String str2 = in.nextLine();
    int strLen1 = str1.length(); 
    int strLen2 = str2.length();
    int matchingIdx = -1;
    int count= 0;
    for(int i = 0; i < (strLen1 - strLen2 + 1); i++)
    {
       boolean match = true;
       for(int j = 0; j < strLen2; j++)
       {
          if(str1.charAt(i+j) != str2.charAt(j))
          {
             match = false;
          }
       }
      if(match == true)
      {
         matchingIdx =i;
         count++;
         
      }
    }
    System.out.println(count);
  }
}

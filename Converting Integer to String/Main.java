import java.util.Scanner;
public class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int temp = n;
    int count = 0;
    if(n < 0)
    {
      while(n < -1)
      {
        count++;
        n = n/10;
      }
      count++;
      count++;
      //System.out.print(count);
     char str[] = new char[count];
     count = count - 1;
     //System.out.print(temp);
     while(temp <= -1)
      {
      char ch = (char)(Math.abs((temp % 10)) + '0');
      str[count] = ch;
      temp /= 10;
      --count;   
      }
      str[count] = '-';
      System.out.print(str);
    }
    if(n > 0)
    {
        while(n > 0)
    {
        count++;
        n = n/10;
    }
    char str[] = new char[count];
    count = count - 1;
    while(temp > 0)
    {
      char ch = (char)((temp % 10) + '0');
      str[count] = ch;
      temp /= 10;
      --count;   
    }
    System.out.print(str);
        
    }
  }
}
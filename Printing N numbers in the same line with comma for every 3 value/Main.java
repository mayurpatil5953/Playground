import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner in = new Scanner (System.in);
    int num = in.nextInt();
    for(int i = 1; i <= num; i++)
    {
       System.out.print(i);
       if((i % 3 == 0)&&(i != num))
       {
           System.out.print(",");
       }
     
    }
  }
}
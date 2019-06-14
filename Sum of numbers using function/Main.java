import java.util.Scanner;
class Main
{
   public static int  sum_of_num(int m)
   {
     int sum1 = 0;
     for(int i = 1; i <= m; i++)
     {
        sum1 = sum1 + i;
     }
      return sum1;
   }
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in = new Scanner (System.in);
      int num = in.nextInt();
      int sum = 0;
      sum = sum_of_num(num);
      System.out.println(sum);
	} 
}
import java.util.Scanner;
class Main
{
   public static int  square(int m)
   {
      int son = m * m;
      return son;
   }
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in = new Scanner (System.in);
      int num = in.nextInt();
      int sq = square(num);
      System.out.println(sq);
	} 
}
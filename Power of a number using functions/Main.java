import java.util.Scanner;
public class Main{
  
    public static int cal_power(int b, int e)
    {
       int power = 1;
      for(int i = 1; i <= e; i++)
      {
          power = power * b;
      }
       return power;
    }
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner in = new Scanner (System.in);
      int base = in.nextInt();
      int exponent = in.nextInt();
      int power = cal_power(base, exponent);
      System.out.println(power);
       
   }
}
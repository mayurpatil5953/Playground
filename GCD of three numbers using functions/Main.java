import java.util.Scanner;
class Main
{
    public static int find_gcd_num_among_two(int num1, int num2)
    {
       int small = 0;
      int gcd = 0;
       small = (num1 < num2)? num1 : num2;
       for(int i = 1; i <= small; i++)
       {
          if((num1 % i ==0)&& (num2 % i ==0))
          gcd = i;
       }
       return gcd;
    }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner (System.in);
      int num1 = in.nextInt();
      int num2 = in.nextInt();
      int num3 = in.nextInt();
      int sec_gcd_num = find_gcd_num_among_two(num1,num2);
      int small = (sec_gcd_num < num3)? sec_gcd_num : num3;
      int gcd =0;
       for(int i = 1; i <= small; i++)
       {
          if((sec_gcd_num % i ==0)&& (num3 % i ==0))
          gcd = i;
       }
      System.out.println(gcd);
  }
}
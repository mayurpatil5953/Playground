import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner (System.in);
      int num = in.nextInt();
      int count = 0;
      int rem,sum = 0;
      int copy;
  
      copy = num;
      while(num != 0)
      {
         rem = num % 10;
         sum = sum + rem*rem*rem;
         num = num / 10;
      }
      if(sum == copy)
      {
          System.out.println("Armstrong Number");
      }
      else
      {
          System.out.println("Not a Armstrong Number");
      }
      
	}
}
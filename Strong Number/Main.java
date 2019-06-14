import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner (System.in);
      int num = in.nextInt();
      int rem = 0;
       int copy,sum = 0;
      
      copy  = num;
      while(num > 0)
      {
         rem = num % 10;
        int fact = 1;
        for(int i = 1; i <= rem; i++)
        {
           fact = fact * i;
        }
        sum = sum + fact;
        num = num / 10;
      }
      if(sum == copy)
      {
          System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
	}
}
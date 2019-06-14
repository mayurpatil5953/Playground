import java.util.Scanner;
class Main{
	public static void main (String[] args)
	{
	   // Type your code here
      Scanner in = new Scanner(System.in);
	  int n = in.nextInt();
	  
      for(int rno =1 ;rno <= n ;rno ++)
      {
		  for(int col =1 ;col <= n ;col ++)
      {
		  if(col == rno || (col == n - rno + 1))
		  {
			  System.out.print("*");
		  }
		  else
		  {
			  System.out.print(" ");
		  }
	  }
	  System.out.println();
	  }
	}  
}
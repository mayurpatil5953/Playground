import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner (System.in);
      int n = in.nextInt();
	  int num = 1;
      for(int cur_row = 1; cur_row <= n; cur_row ++)
      {
          for(int sp = 1; sp <= n - cur_row; sp ++)
          {
             System.out.print(" ");
          }
          for(int cur_col = 1; cur_col <= num; cur_col ++)
          {
             System.out.print("*");
			 
          }
		  num = num + 2;
        System.out.println();
      }
	}
}
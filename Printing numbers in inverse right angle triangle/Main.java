import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner (System.in);
      int n = in.nextInt();
	  int starC = n;
	  int num = 4;
      for(int cur_row = n; cur_row >= 1; cur_row --)
      {
          for(int cur_col = cur_row; cur_col > 0; cur_col --)
          {	
	     	 System.out.print(cur_col);
			}
		 
        System.out.println();
      }
	}
}
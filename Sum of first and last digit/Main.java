import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
         Scanner in = new Scanner (System.in);
      int n = in.nextInt();
      int l_no = n % 10;
      int f_no=0;
      
      while (n >= 10 )
      {
         n = n / 10;
         f_no = n;
      }
      int sum = 0;
      sum = f_no + l_no;
      System.out.println(sum);
	}
}
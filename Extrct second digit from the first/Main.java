
import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner (System.in);
      int n = in.nextInt();
      int secondDigNum = 0 ;
      int rem;
      while (n >= 10)
      {
         rem = n % 10;
         secondDigNum = rem;
         n = n / 10;
      }
      System.out.println(secondDigNum);
    }
}
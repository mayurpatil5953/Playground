import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int fnum=num/100;
      int lnum=num%10;
      int sum=fnum+lnum;
      
      System.out.println(sum);

   
	}
}
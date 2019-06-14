import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
     
      int temp=num/10;
      int slast=temp%10;
      
      System.out.println(slast);
      
     
	}
}
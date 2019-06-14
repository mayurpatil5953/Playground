import java.util.Scanner;
class Main{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int rno = 1; rno <= n; rno ++)
		{
			for(int col = 1; col <= n; col ++)
		{
			if(rno == 1 || rno == n || col == 1 || col == n)
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
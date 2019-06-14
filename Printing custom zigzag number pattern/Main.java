import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
	  int n = in.nextInt();
      for(int rno =1 ;rno <= n ;rno ++)
      {
         if(rno % 2 != 0)
         {
            for(int col = 1; col < n+1; col++)
            {
            if(col < n)
            {
            System.out.print(rno);
            }
              else
              {
               System.out.print(rno+1);
              }
            }
         }
        else if(rno % 2 == 0)
        {
        for(int col = 1; col < n+1; col++)
        {
           if(col == 1)
           {
           System.out.print(rno+1);
           }
           else
           {
           System.out.print(rno);
           }
        }
        }
        System.out.println();
      }
	}
}
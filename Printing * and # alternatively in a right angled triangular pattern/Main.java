import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      int num = in.nextInt();
      int flag = 0;
      for(int cur_row = 1; cur_row <= num; cur_row++)
      {
         for(int cur_col = 1; cur_col <= cur_row; cur_col++)
         {
            if(flag == 0)
            {
               System.out.print("*");
               flag = 1;
            }
           else if(flag == 1 )
           {
              System.out.print("#");
              flag = 0;
           }
         }
        System.out.println();
      }
    }
}
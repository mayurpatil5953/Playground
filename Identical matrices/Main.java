import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int r1 = in.nextInt();
        int c1 = in.nextInt();
        int a[][] = new int[r1][c1];
        int b[][] = new int[r1][c1];
        for(int i = 0; i < r1; i++)
        {
            for(int j = 0; j < c1; j++)
            {
                a[i][j] = in.nextInt();
            }
        }
        for(int i = 0; i < r1; i++)
        {
            for(int j = 0; j < c1; j++)
            {
                b[i][j] = in.nextInt();
            }
        }
      int flag = 0;
        for(int i = 0; i < r1; i++)
        {
            for(int j = 0; j < c1; j++)
            {
                if(a[i][j] != b[i][j])
                {
                   flag = 1;
                }
            }
        }
      if(flag == 1)
      {
         System.out.println("No");
      }
      else
      {
         System.out.println("Yes");
      }
    //your code here
  }
}
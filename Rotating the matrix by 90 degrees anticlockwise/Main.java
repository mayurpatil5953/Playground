import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int r1 = in.nextInt();
        int c1 = in.nextInt();
        int a[][] = new int[r1][c1];
        for(int i = 0; i < r1; i++)
        {
            for(int j = 0; j < c1; j++)
            {
                a[i][j] = in.nextInt();
            }
        } 
        for(int i = r1-1; i >=0; i--)
        {
            for(int j = 0; j < c1; j++)
            {
                System.out.print(a[j][i]+" ");
            }
              System.out.println();
        }
      
    // your code here
  }
}
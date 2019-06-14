import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    Scanner in = new Scanner(System.in);
    int row_size = in.nextInt();
    int col_size = in.nextInt();
    int matrix1[][] = new int[row_size][col_size]; 
    int matrix2[][] = new int[row_size][col_size];
    int sub[][] = new int[row_size][col_size];
    for(int i=0; i < row_size; i++)
    {
      for(int j=0; j < col_size; j++)
      {
         matrix1[i][j] = in.nextInt();
      }  
    }
    for(int i=0; i < row_size; i++)
    {
      for(int j=0; j < col_size; j++)
      {
         matrix2[i][j] = in.nextInt();
      }  
    }
    for(int i=0; i < row_size; i++)
    {
      for(int j=0; j < col_size; j++)
      {
         sub[i][j] = matrix1[i][j] - matrix2[i][j];
         System.out.print(sub[i][j]+" ");
      } 
      System.out.println();
    }
  }
}
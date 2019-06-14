import java.util.Scanner;
class Main{ 
    public static void  dispay_mat(int matrix1[][],int row_size,int col_size)
    {
         for(int j=0; j < col_size; j++)
         {
            for(int i=0; i < row_size; i++)
            {
               System.out.print(matrix1[i][j]+" ");
            } 
           System.out.println();
       }
    }
  public static void main(String args[]) 
  { 
    Scanner in = new Scanner(System.in);
    int row_size = in.nextInt();
    int col_size = in.nextInt();
    int matrix1[][] = new int[row_size][col_size]; 
    for(int i=0; i < row_size; i++)
    {
      for(int j=0; j < col_size; j++)
      {
         matrix1[i][j] = in.nextInt();
      }  
    }
    dispay_mat(matrix1,row_size,col_size);
  }
}
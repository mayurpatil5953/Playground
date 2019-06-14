import java.util.Scanner;
class Main
{
  public static int fact(int n)
  {
    if(n == 1)
    {
      return 1;
    }
    else
    {
    int factorial = 1;
    factorial = n*fact(n-1);
    return factorial;
    }
  }
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    System.out.println(fact(n));
  }
}
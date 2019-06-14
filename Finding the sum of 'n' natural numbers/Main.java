import java.util.Scanner;
class Main
{
  public static int sum(int n)
  {
    if(n == 0)
    {
      return 0;
    }
    else
    {
    int addition = 0;
    addition = n + sum(n-1);
    return addition;
    }
  }
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    System.out.println(sum(n));
  }
}
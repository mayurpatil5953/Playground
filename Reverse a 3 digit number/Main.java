import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in=new Scanner(System.in);
    
    int num=in.nextInt();
    int f,s,l;
    f=num/100;
    s=(num/10)%10;
    l=num%10;
    
    int gnum=(l*100)+(s*10)+f;
    
    System.out.println(gnum);
  }
}
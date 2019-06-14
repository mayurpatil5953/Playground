import java.util.Scanner;
public class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    int str_len = str.length();
    //char res[] = new char[str_len];
    //int idx = 0;
    // StringBuilder sb = new StringBuilder(str);
    //StringBuilder res = new StringBuilder(" ");
    for(int i = 0; i < str_len; i++)
    {
       char ch = str.charAt(i);
       if( (ch != 'a' && ch !='e' && ch != 'i' && ch != 'o' && ch !='u') && (ch != 'A' && ch !='E' && ch != 'I' && ch != 'O' && ch !='U'))
       {
          System.out.print(ch);
       }
    }
 
    
  }
}
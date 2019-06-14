import java.util.Scanner;
import java.util.Arrays;
public class Main
{
public static void main(String args[])
{
//Try out your code here
  Scanner in = new Scanner(System.in);
  String str = in.nextLine();
  StringBuilder sb = new StringBuilder(str);
  int str_len = sb.length();
  int stat[] = new int[70];
  Arrays.fill(stat, 0);
 
  for(int i = 0; i < str_len; i++)
  {
     if(sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z')
     {
        int off = str.charAt(i) - 'A';
        char ch = (char) ('a' + off);
        sb.setCharAt(i, ch);
     }
     if(sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z')
     {
        stat[sb.charAt(i) - 'a'] ++;
     }

     if(sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z')
     {
        stat[sb.charAt(i) - 'A'] ++;
     }
  }
    for(int i = 0; i< str_len; i++)
    {
        if(stat[sb.charAt(i)- 'a'] != 0)
        {
            System.out.print(sb.charAt(i) +"" +stat[sb.charAt(i)-'a']+" ");
            stat[sb.charAt(i) -'a'] = 0;
        }
    }
 }
}
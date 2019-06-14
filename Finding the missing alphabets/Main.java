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
  int str_len = str.length();
  int stat[] = new int[26];
  Arrays.fill(stat, 0);
 
  for(int i = 0; i < str_len; i++)
  {
     
     
     if(sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z')
     {
        stat[sb.charAt(i) - 'A']++;
     }
     if(sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z')
     {
        stat[sb.charAt(i) - 'a'] ++;
     }
  }
    for(int i = 0; i< 26; i++)
    {
        if(stat[i] == 0)
        {
            char miss_alpha = (char)(i + 'a');
            System.out.print(miss_alpha+" ");
            
        }
        
    }
  }
 
}

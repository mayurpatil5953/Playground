import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in = new Scanner (System.in);
      String str1 = in.nextLine();
      int str_len = str1.length();
      StringBuilder sb = new StringBuilder(str1);
      StringBuilder tempStr = new StringBuilder("");
      for(int i = str_len - 1; i >= 0 ;i --)
      {
         char temp_ch = sb.charAt(i);
         tempStr.append(temp_ch);
      }
      boolean yes = false;
      for(int i = 0; i < str_len;i ++)
      {
         if(sb.charAt(i) == tempStr.charAt(i))
         {
            yes = true;
         }
       else
         {
            yes = false;
         }
      }
      if(yes == true)
      {
         System.out.println("Yes");
      }
      else
      {
         System.out.println("No");
      }
      
    } 
}
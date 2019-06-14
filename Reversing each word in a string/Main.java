import java.util.Scanner;
import java.lang.*; 
class Main{
  public static void main(String args[]) 
  {
    Scanner in = new Scanner(System.in);
    String string = in.nextLine();
    String arr[] = string.split(" ");
    for(int i = 0; i < 3; i++)
    { 
        StringBuffer sbf = new StringBuffer(arr[i]); 
        //System.out.println("String buffer = " + sbf); 
          
        // Here it reverses the string buffer 
        sbf.reverse(); 
        System.out.print(sbf+" "); 
    }
  }
}
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
    String s = sc.nextLine();
    String[] split = s.split(" ");
    String result = "";
    for (int i = split.length - 1; i >= 0; i--) 
    {
    result += (split[i] + " ");
    }
     System.out.println(result.trim());
	}
}
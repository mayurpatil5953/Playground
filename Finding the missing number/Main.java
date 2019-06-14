import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int[] num=new int[n];
	    for (int i=0;i<n ;i++ )
	    {
	       num[i]=sc.nextInt();
	    }
	   if(n > 5)
	    { 
	    for(int j=0;j<n;j++)
	    {
	        if(num[j]!=j+1)
	        {
	            System.out.println(j+1);
	            break;
	        }
	    }
	  }
	  else
	  {
	     Arrays.sort(num);
        int found_element = 0;
  
        //System.out.printf("Modified arr[] : %s", 
         //                 Arrays.toString(arr)); 
         for(int i = 0; i < n; i++)
        {
             for(int j = 1; j <= n; j++)
        {
            if(num[i] != j)
            {
                found_element = j;
            }
        }
            
        }
        System.out.println(found_element);
	  }
	    
                          
	}
}
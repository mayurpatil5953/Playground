import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      int marks;
      Scanner in = new Scanner (System.in);
      marks = in.nextInt();
      
     if(marks >= 85)
       {
         System.out.println("A"); 
        }
     else if(marks >= 75)
       {
         System.out.println("B"); 
        }
     else if(marks >= 65)
     {
       System.out.println("C"); 
     }
     else if(marks >= 55)
     {
       System.out.println("D");  
     }
     else if(marks >= 45)
     {
       System.out.println("E");  
     }
     else
     {
       System.out.println("Fail");  
     }
}
}
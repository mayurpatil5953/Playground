import java.util.*;
public class Main
{
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String str=sc.nextLine();
     char[] a=str.toCharArray();
     char[] b=new char[a.length];
     int count=0;
     for(int i=a.length/2;i<a.length;i++)
     {
         b[count]=a[i];
         count++;
     }
     for(int i=0;i<a.length/2;i++)
     {
         b[count]=a[i];
         count++;
     }
     for(int i=0; i<a.length;i++)
     {
         for(int j=i;j<a.length-1;j++)
         {
          System.out.print(" ");   
         }
         for(int k=0;k<=i;k++)
         {
          System.out.print(b[k]);
         }
         System.out.println();
     }
 }
}
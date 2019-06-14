import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int ch = in.nextInt();
      switch(ch)
      {
        case 1:
          int side = in.nextInt();
          int rsl = side*side;
          System.out.println(rsl);
          break;
        case 2:
          int length = in.nextInt();
          int breadth = in.nextInt();
          int areaL = length * breadth;
          System.out.println(areaL);
          break;
        case 3:
          int base = in.nextInt();
          int height = in.nextInt();
          int areaT = (base * height)/2;
          System.out.println(areaT);
          break;
        case 4:
          int r = in.nextInt();
          double areaC;
          areaC = 3.14 * r * r;
          System.out.println(areaC);
          break;
      }
    }
}
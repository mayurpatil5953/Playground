import java.util.Scanner;
class Main{
    public static int find_greatest_num_among_two(int num1, int num2)
    {
       int greater = 0;
       greater = (num1 > num2)? num1 : num2;
       return greater;
    }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner (System.in);
      int num1 = in.nextInt();
      int num2 = in.nextInt();
      int num3 = in.nextInt();
      int sec_greatest_num = find_greatest_num_among_two(num1,num2);
      int greatest_num = (sec_greatest_num > num3)? sec_greatest_num : num3;
      System.out.println(greatest_num);
  }
}
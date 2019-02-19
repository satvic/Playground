import java.util.Scanner;
class Main
{
  public static int sum (int num)
  { 
    int sum = 0;
    for (int i = 1; i <= num; i++)
    {
      sum = i + sum; 
  }
    return sum;
  }
    
	public static void main (String[] args)
    {
	  Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int sum = sum(num);
      System.out.print(sum);
	} 
}
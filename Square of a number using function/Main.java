import java.util.Scanner;
class Main
{
  public static int square (int num)
  {
    int result = num*num;
    return result;
  }
    
	public static void main (String[] args)
    {
	  Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int square = square(num);
      System.out.print(square);
	} 
}
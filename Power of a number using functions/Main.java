import java.util.Scanner;
class Main
{
  public static int power (int num1, int num2)
  { 
    int temp = 1;
    while (num2 != 0)
    {
      temp = num1*temp; 
       num2--;
    }
    return temp;
    
  }
    
	public static void main (String[] args)
    {
	  Scanner in = new Scanner(System.in);
      int base = in.nextInt();
      int expo = in.nextInt();
      int res = power(base,expo);
      System.out.println(res);
      
	} 
}